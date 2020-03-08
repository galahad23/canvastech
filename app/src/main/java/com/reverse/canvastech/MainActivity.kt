package com.reverse.canvastech

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap: Bitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        val box1 = ShapeDrawable(RectShape())

        val left1 = 50
        val top1 = 50
        val right1 = 375
        val bottom1 = 375

        box1.setBounds( left1, top1, right1, bottom1)
        box1.paint.color = Color.parseColor("#ffffff")
        box1.draw(canvas)

        val box2 = ShapeDrawable(RectShape())

        val left2 = 425
        val top2 = 50
        val right2 = 750
        val bottom2 = 375

        box2.setBounds( left2, top2, right2, bottom2)
        box2.paint.color = Color.parseColor("#ffffff")
        box2.draw(canvas)

        val box3 = ShapeDrawable(RectShape())

        val left3 = 50
        val top3 = 425
        val right3 = 375
        val bottom3 = 750

        box3.setBounds( left3, top3, right3, bottom3)
        box3.paint.color = Color.parseColor("#ffffff")
        box3.draw(canvas)

        val box4 = ShapeDrawable(RectShape())

        val left4 = 425
        val top4 = 425
        val right4 = 750
        val bottom4 = 750

        box4.setBounds( left4, top4, right4, bottom4)
        box4.paint.color = Color.parseColor("#ffffff")
        box4.draw(canvas)

        imageV.background = BitmapDrawable(resources, bitmap)
    }
}
