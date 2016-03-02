package com.google.zxing.qrcodeutils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.util.Hashtable;

/**
 * Created by caizenghui on 16/1/25.
 */
public class QRCodeUtils {

    private static QRCodeUtils instance;

    public static QRCodeUtils getInstance() {
        if (instance == null) {
            instance = new QRCodeUtils();
        }
        return instance;
    }

    public Bitmap generateQRCode(Context context, String url, int size, int logoId) {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.CHARACTER_SET, "utf-8");
            hashtable.put(EncodeHintType.MARGIN, 1);
            hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            BitMatrix matrix = new QRCodeWriter().encode(url, BarcodeFormat.QR_CODE, size, size, hashtable);
            Bitmap originBmp = bitMatrix2Bitmap(matrix);
            Bitmap logoBmp = BitmapFactory.decodeResource(context.getResources(), logoId);
            addLogo(originBmp, logoBmp);
            return originBmp;
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Bitmap bitMatrix2Bitmap(BitMatrix matrix) {
        int w = matrix.getWidth();
        int h = matrix.getHeight();
        int[] rawData = new int[w * h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int color = Color.WHITE;
                if (matrix.get(i, j)) {
                    color = Color.BLACK;
                }
                rawData[i + (j * w)] = color;
            }
        }

        Bitmap bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(rawData, 0, w, 0, 0, w, h);
        return bitmap;
    }

    private void addLogo(Bitmap originBitmap, Bitmap logoBmp) {
        Canvas canvas = new Canvas(originBitmap);
        canvas.drawBitmap(logoBmp, originBitmap.getWidth() / 2 - logoBmp.getWidth() / 2, originBitmap.getHeight() / 2 - logoBmp.getHeight() / 2, null);
    }
}