package com.zhouqingbiao.cube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化就随机显示图片并从list中移除
        val tempF2L = tempsF2L.random()
        findViewById<ImageView>(R.id.imageViewF2L).setImageResource(tempF2L)
        tempsF2L.remove(tempF2L)

        val tempOLL = tempsOLL.random()
        findViewById<ImageView>(R.id.imageViewOLL).setImageResource(tempOLL)
        tempsOLL.remove(tempOLL)

        val tempPLL = tempsPLL.random()
        findViewById<ImageView>(R.id.imageViewPLL).setImageResource(tempPLL)
        tempsPLL.remove(tempPLL)
    }

    // F2L
    private val imagesF2L = listOf(
        R.mipmap.f2l1,
        R.mipmap.f2l10,
        R.mipmap.f2l11,
        R.mipmap.f2l12,
        R.mipmap.f2l13,
        R.mipmap.f2l14,
        R.mipmap.f2l15,
        R.mipmap.f2l16,
        R.mipmap.f2l17,
        R.mipmap.f2l18,
        R.mipmap.f2l19,
        R.mipmap.f2l2,
        R.mipmap.f2l20,
        R.mipmap.f2l21,
        R.mipmap.f2l22,
        R.mipmap.f2l23,
        R.mipmap.f2l24,
        R.mipmap.f2l25,
        R.mipmap.f2l26,
        R.mipmap.f2l27,
        R.mipmap.f2l28,
        R.mipmap.f2l29,
        R.mipmap.f2l2_1,
        R.mipmap.f2l2_2,
        R.mipmap.f2l3,
        R.mipmap.f2l30,
        R.mipmap.f2l31,
        R.mipmap.f2l32,
        R.mipmap.f2l33,
        R.mipmap.f2l34,
        R.mipmap.f2l35,
        R.mipmap.f2l35_1,
        R.mipmap.f2l36,
        R.mipmap.f2l36_1,
        R.mipmap.f2l37,
        R.mipmap.f2l38,
        R.mipmap.f2l39,
        R.mipmap.f2l3_1,
        R.mipmap.f2l3_2,
        R.mipmap.f2l4,
        R.mipmap.f2l40,
        R.mipmap.f2l41,
        R.mipmap.f2l5,
        R.mipmap.f2l6,
        R.mipmap.f2l7,
        R.mipmap.f2l8,
        R.mipmap.f2l9
    )

    private var tempsF2L = imagesF2L.toMutableList()
    fun randomImageF2L(view: View) {
        val imageView = findViewById<ImageView>(R.id.imageViewF2L)

        val temp = tempsF2L.random()

        imageView.setImageResource(temp)

        tempsF2L.remove(temp)

        println(tempsF2L.size)

        if (tempsF2L.size == 0) {
            tempsF2L = imagesF2L.toMutableList()
            findViewById<TextView>(R.id.textView).text = "F2L一组训练完毕！"
        }
    }

    // OLL
    private val imagesOLL = listOf(
        R.mipmap.o1,
        R.mipmap.o2,
        R.mipmap.o3,
        R.mipmap.o4,
        R.mipmap.o5,
        R.mipmap.o6,
        R.mipmap.o7,
        R.mipmap.o8,
        R.mipmap.o9,
        R.mipmap.o10,
        R.mipmap.o11,
        R.mipmap.o12,
        R.mipmap.o13,
        R.mipmap.o14,
        R.mipmap.o15,
        R.mipmap.o16,
        R.mipmap.o17,
        R.mipmap.o18,
        R.mipmap.o19,
        R.mipmap.o20,
        R.mipmap.o21,
        R.mipmap.o22,
        R.mipmap.o23,
        R.mipmap.o24,
        R.mipmap.o25,
        R.mipmap.o26,
        R.mipmap.o27,
        R.mipmap.o28,
        R.mipmap.o29,
        R.mipmap.o30,
        R.mipmap.o31,
        R.mipmap.o32,
        R.mipmap.o33,
        R.mipmap.o34,
        R.mipmap.o35,
        R.mipmap.o36,
        R.mipmap.o37,
        R.mipmap.o38,
        R.mipmap.o39,
        R.mipmap.o40,
        R.mipmap.o41,
        R.mipmap.o42,
        R.mipmap.o43,
        R.mipmap.o44,
        R.mipmap.o45,
        R.mipmap.o46,
        R.mipmap.o47,
        R.mipmap.o48,
        R.mipmap.o49,
        R.mipmap.o50,
        R.mipmap.o51,
        R.mipmap.o52,
        R.mipmap.o53,
        R.mipmap.o54,
        R.mipmap.o55,
        R.mipmap.o56,
        R.mipmap.o57
    )

    private var tempsOLL = imagesOLL.toMutableList()
    fun randomImageOLL(view: View) {
        val imageView = findViewById<ImageView>(R.id.imageViewOLL)

        val temp = tempsOLL.random()

        imageView.setImageResource(temp)

        tempsOLL.remove(temp)

        println(tempsOLL.size)

        if (tempsOLL.size == 0) {
            tempsOLL = imagesOLL.toMutableList()
            findViewById<TextView>(R.id.textView).text = "OLL一组训练完毕！"
        }
    }

    // PLL
    private val imagesPLL = listOf(
        R.mipmap.a,
        R.mipmap.a1,
        R.mipmap.e,
        R.mipmap.f,
        R.mipmap.g,
        R.mipmap.g1,
        R.mipmap.g2,
        R.mipmap.g3,
        R.mipmap.h,
        R.mipmap.j,
        R.mipmap.j1,
        R.mipmap.n,
        R.mipmap.n1,
        R.mipmap.r,
        R.mipmap.r1,
        R.mipmap.t,
        R.mipmap.u,
        R.mipmap.u1,
        R.mipmap.v,
        R.mipmap.y,
        R.mipmap.z
    )

    private var tempsPLL = imagesPLL.toMutableList()

    fun randomImagePLL(view: View) {
        val imageView = findViewById<ImageView>(R.id.imageViewPLL)

        val temp = tempsPLL.random()

        imageView.setImageResource(temp)

        tempsPLL.remove(temp)

        println(tempsPLL.size)

        if (tempsPLL.size == 0) {
            tempsPLL = imagesPLL.toMutableList()
            findViewById<TextView>(R.id.textView).text = "PLL一组训练完毕！"
        }
    }
}