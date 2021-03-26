package com.aboubakergb.foodapp.JuicesScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import com.aboubakergb.foodapp.Food
import com.aboubakergb.foodapp.FoodsScreens.FoodDetailActivity
import com.aboubakergb.foodapp.FoodsScreens.MainActivity
import com.aboubakergb.foodapp.R
import kotlinx.android.synthetic.main.activity_juices_screen.*

class JuicesScreenActivity : AppCompatActivity() {

    private val juiceList = listOf(
        Food(R.drawable.juice_1,"عصير التوت المشكل للمناعة",
            "المقادير\n" +
                    "\n" +
                    "- عصير الأناناس : كوب\n" +
                    "- الموز : 2 حبة\n" +
                    "- لبن زبادي : كوب\n" +
                    "- التوت البري : 2 كوب\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "أدخلي أكواب التقديم إلى الثلاجة حتى تبرد.\n" +
                    "قطّعي الموز وضعيه في الخلاط الكهربائي.\n" +
                    "أضيفي التوت وعصير الأناناس.\n" +
                    "اخلطي المكونات حتى تحصلي على مزيج ناعم ومتجانس.\n" +
                    "اسكبي العصير في أكواب التقديم المبرّدة."),
        Food(R.drawable.juice_2,"موهيتو الفراولة",
            "\n" +
                    "المقادير\n" +
                    "\n" +
                    "- حليب لوز : نصف كوب (غير محلى وبارد)\n" +
                    "- لبن : ثلث كوب (خالي الدسم وبارد)\n" +
                    "- السبانخ : كوب\n" +
                    "- الموز : 1 حبة (متوسط الحجم)\n" +
                    "- أناناس : نصف كوب\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "أضيفي حليب اللوز واللبن وأوراق السبانخ والموز والأناناس في الخلاط.\n" +
                    "اخلطي جميع المكونات حتى تتجانس.\n" +
                    "صبّي المشروب في كوب التقديم وقدميه فوراً"),
        Food(R.drawable.juice_3,"سموذي السبانخ بالأناناس",
            "المقادير\n" +
                    "\n" +
                    "- عصير الأناناس : كوب\n" +
                    "- الموز : 2 حبة\n" +
                    "- لبن زبادي : كوب\n" +
                    "- التوت البري : 2 كوب\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "أدخلي أكواب التقديم إلى الثلاجة حتى تبرد.\n" +
                    "قطّعي الموز وضعيه في الخلاط الكهربائي.\n" +
                    "أضيفي التوت وعصير الأناناس.\n" +
                    "اخلطي المكونات حتى تحصلي على مزيج ناعم ومتجانس.\n" +
                    "اسكبي العصير في أكواب التقديم المبرّدة."),
        Food(R.drawable.juice_4,"عصير كوكتيل",
            "المقادير\n" +
                    "\n" +
                    "- البرتقال : 2 حبة (مقطع)\n" +
                    "- مانغو : 1 حبة (مقطع)\n" +
                    "- الفراولة : 5 حبات (مقطعة)\n" +
                    "- الموز : 2 حبة (مقطع)\n" +
                    "- التفاح : 2 حبة (مقطع)\n" +
                    "- حليب : نصف كوب\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "في وعاء الخلاط الكهربائي، ضعي قطع البرتقال والمانغو.\n" +
                    "اخلطي المكونات جيداً حتى تحصلي على مزيج ناعم القوام ثم وزعيه في قعر أكواب التقديم.\n" +
                    "اخلطي في وعاء الخلاط الكهربائي كل من الفراولة والموز.\n" +
                    "وزعي مزيج الفراولة فوق طبقة البرتقال ثم اتركي الأكواب جانباً.\n" +
                    "اخلطي التفاح والحليب في الخفاق ثم وزعي المزيج على وجه الأكواب قبل التقديم."),
        Food(R.drawable.juice_5,"عصير الأفوكادو بالحليب",
            "\n" +
                    "المقادير\n" +
                    "\n" +
                    "- الأفوكادو : 1 حبة\n" +
                    "- حليب : 3 اكواب\n" +
                    "- خلاصة الفانيليا : 2 ملعقة صغيرة\n" +
                    "- سكر : 3 ملاعق كبيرة\n" +
                    "- مكعبات الثلج : حسب الرغبة\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "قشري حبة الأفوكادو وقطعيها إلى قطع متوسطة.\n" +
                    "ضعي الأفوكادو مع الحليب، خلاصة الفانيليا، السكر ومكعبات الثلج في الخلاط الكهربائي.\n" +
                    "اخلطي المكونات حتى تتجانس جيداً.\n" +
                    "وزّعي العصير على كوبين وقدميه بارداً مع المزيد من مكعبات الثلج."),
        Food(R.drawable.juice_6,"عصير البرتقال بالزنجبيل لنزلات البرد",
            "المقادير\n" +
                    "\n" +
                    "- البرتقال : 3 حبات (مقشر)\n" +
                    "- الزنجبيل : ملعقة كبيرة (مفروم)\n" +
                    "- الليمون : 1 حبة (مقشر)\n" +
                    "- الكركم : نصف ملعقة صغيرة (مطحون)\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "اخلطي بالخلاط البرتقال والزنجبيل والليمون جيداً حتى تمتزج المكونات وتصبح ناعمة.\n" +
                    "أضيفي الكركم واخلطي جيداً.\n" +
                    "صفّي المزيج في أكواب وقدميه."),
        Food(R.drawable.juice_7,"سموذي المانجو بالموز",
            "المقادير\n" +
                    "\n" +
                    "- عصير الأناناس : نصف كوب\n" +
                    "- مانغو : 2 كوب (مقطّع، ومجمّد)\n" +
                    "- الموز : نصف حبة\n" +
                    "- لبن زبادي : نصف كوب\n" +
                    "- العسل : ملعقة كبيرة\n" +
                    "طريقة التحضير\n" +
                    "\n" +
                    "قطّعي الموزة إلى دوائر.\n" +
                    "في الخلاط الكهربائي، ضعي قطع المانجو المجمّدة ودوائر الموز.\n" +
                    "أضيفي اللبن الزبادي وعصير الأناناس والعسل.\n" +
                    "اخلطي المكونات جيداً حوالي عدة دقائق.\n" +
                    "صبّي السموثي في كوبين وقدّميهما.")
    )

    companion object {
        const val INTENT_JUICE = "OBJECT_JUICE"
    }

    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juices_screen)

        toggle = ActionBarDrawerToggle(this, drawerLayoutJuices, R.string.open, R.string.close)
        drawerLayoutJuices.addDrawerListener(toggle)
        toggle.syncState()

        // set back button when drawer is open
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // select menu item
        navViewJuices.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.mi_food_activity -> {
                    val intentFoodActivity = Intent(this, MainActivity::class.java)
                    startActivity(intentFoodActivity)
                }

            }
            true
        }

        recycle_view_juices.layoutManager = LinearLayoutManager(this)
        recycle_view_juices.setHasFixedSize(true)

        recycle_view_juices.adapter = JuicesAdapter(this, juiceList) {
            // item when item clicked
            val intentJuice = Intent(
                this,
                JuiceDetailActivity::class.java
            )
            intentJuice.putExtra(
                INTENT_JUICE,
                it
            )
            startActivity(intentJuice)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}