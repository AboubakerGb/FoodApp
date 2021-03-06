package com.aboubakergb.foodapp.FoodsScreens

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.aboubakergb.foodapp.Food
import com.aboubakergb.foodapp.JuicesScreen.JuicesScreenActivity
import com.aboubakergb.foodapp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private val foodList = listOf(
        Food(
            R.drawable.recipe_1,
            "الكيكة اليومية الإسفنجية",
            " المقادير \n بيض ، نصف كأس حليب نصف كأس زيت ، ثلث كأس سكر ، كأس غير مملوء دقيق أبيض ( فرينة ) ، كيس خميرة كيميائية ، كيس سكر فنيليا . \nطريق التحضير :\n إخلطي البيض مع السكر والفنيليا والحليب حتى يذوب السكر أضيفي الزيت   وحركي جييدا أضيفي الفرينة وحركي جييدا إدهني قالب الفرن بالزيت أسكبي الخليط في القالب وقومي بطهيها في الفرن على درجة  180  "
        ),
        Food(
            R.drawable.recipe_2, "كروكي سهل وهش ",
            "المقادير : \n" +
                    "\n" +
                    "3 حبات بيض ، 3 كأوس شاي زيت ، 2 كاأس شاي سكر ، كيس سكر فنيليا او بشر ليمون أو برتقال ، كيس خميرة كيميائية ، دقيق أبيض ( فرينة ) حسب العجين\n" +
                    "طريقة التحضير :\n" +
                    "\n" +
                    "نخلط البيض والسكر وسكر الفنيليا أو بشر اليمون جيدا\n" +
                    "نضيف الزيت ونخلط جيدا\n" +
                    "نضيف الدقيق مع الخميرة الكيميائية ونحرك حتى يصبح العجين لا يلتصق بالحلة ونتوقف ( يكون العجين طري جدا ويلتصق بليدين )\n" +
                    "ندهن اليدين بالزيت ونشكل العجين في صينية الفرن على شكل مستطيلات بعرض 3 سنتيمتر ( سيصبح الشريط أعرض ولن يحافض على نفس العرض لأنه طري )\n" +
                    "إدهني المستطيلات بصفار البيضة مخلوط مع ملعقة قهوة زيت\n" +
                    "زييني العجين بعمل خطوط بواسطة فرشات\n" +
                    "أدخليه الفرن على درجة 180 حتى ينضج قومي بتحميره من الفوق\n" +
                    "أخرجيه من الفرن وإقسميه مباشرة على شكل مستطيلات\n"
        ),
        Food(
            R.drawable.recipe_3, "موسكوتشو بالشكولاطة",
            "المقادير:\n" +
                    "1كاس سكر ، 1/2 كاس زيت ، 1 كاس حليب ، 4 بيض ، كيس سكر فانيليا ( ملعقة كبيرة ) ، 2 كيس خميرة ، 3 ملاعق كاكاو  ، 12 ملعقة فرينة ( دقيق أبيض ) .\n" +
                    "طريقة التحضير:\n" +
                    "في وعاء حديدي أسكبي السكر والزيت والحليب والفنيليا والكاكاو \n" +
                    "ضعيهم على نار هائة اخلطي جيدا  حتى الغليان \n" +
                    "أطفئي النار عليها وتركيها تبرد جيدا \n" +
                    " أضيفي البيض وقومي بالخلط حتى يمتزج الخليط جيدا\n" +
                    "أضيفي الخميرة والفرينة ( الدقيق الأبيض ) بالتدرج \n" +
                    "إخلطي جيدا حتى يتجانس خليط المسكوتشو\n" +
                    "إدهني قالب يدخل للفرن بالزبدة ونثري فوقها قليلا من الدقيق الأبيض \n" +
                    "قومي بتحريك القالب في جميع الإتجاهات حتى تلتصق الفرينة ( الدقيق الأبيض ) في جميع جوانب القالب  \n" +
                    "اذا كان لديك ورق الطهي إستعمليه بدلا من هذه الطريقة ، إذا كان القالب من النوعية الجيدة يمكنكي الإكتفاء بالزبدة \n" +
                    "اسكبي خليط المسكوتشو في القالب حيث يكون سمكه حوالي 1،5 سنتمتر لكي تحصلي على مسكوتشو خفيف \n" +
                    "ادخلي القالب للفرن على درجة حرارة 180 لمدة 20 دقيقة ( الطهي يختلف حسب نوعية الفرن )\n" +
                    "اذيبي الشكولاطة في حمام ماري \n" +
                    " بعد نزع القالب من الفرن اسكبي فوقه الشكولاطة مباشرة \n" +
                    "ابسطيها باستعمال ملعقة او اسباتولا \n" +
                    "أتركي المسكوتشو تبرد ثم أدخليها البراد  حتى تبرد جيدا وتتماسك الشكولاطة \n" +
                    "قطعيها على شكل مربعات وقدميها باردة ."
        ),
        Food(
            R.drawable.recipe_4, "حلوة المحقن",
            "المقادير:\n" +
                    "3بيض , 3/4 كأس زيت , 1/2 كأس سكر , كيس خميرة كيميائية , مبشور ليمون او ملعقة صغيرة فنيليا , دقيق ابيض .\n" +
                    "للزينة : \n" +
                    "شكلاطة ,جوز الهند.\n" +
                    "طريقة التحضير :\n" +
                    "إخلطي السكر مع البيض جيدا \n" +
                    "أضيفي الزيت ونخلط جيدا\n" +
                    "اضيفي قليلا من الدقيق مع الفنيليا والخميرة امزجي الخليط جيدا مع اضافة الدقيق حتى تحصلي على عجينة طرية ومتماسكة تخرج بسهولة من الكيس الحلواني \n" +
                    "ادهني صينية الفرن بالزبدة وشكليها دوائر باستعمال كيس الحلواني\n" +
                    "اطهيها في فرن 180 درجة مدة حوالي ربع ساعة إلى 20 دقيقة\n" +
                    "زينيها بالشكلاطة الذائبة وجوز الهند"
        ),
        Food(
            R.drawable.recipe_5, "موسكوتشو سهلة وناجحة",
            "المقادير:\n" +
                    "3بيض , 1/2 كأس سكر , 1/3 كأس زيت , كيس خميرة كيميائية , بشر برتقال او ليمون , 1/4 كاس حليب , كاس دقيق ابيض .\n" +
                    "طريقة التحضير:\n" +
                    "إخلطي بياض البيض جيدا مع قرصة ملح حتى يتحول إلى ثلج هذه الخطوة مهمة جدا وهي سر هشاشة وخفة الموسكوتشو \n" +
                    "إخفقي الصفار مع السكر \n" +
                    "أضيفي الزيت والحليب وبشر البرتقال واخلطي جيدا \n" +
                    "أضيفي الدقيق والخميرة الكيميائية واخلطي جيدا\n" +
                    "أضيفي بياض البيض على دفعتين مع التحريك برفق من الأسفل الى الأعلى حتى لا يفقد بياض البيض حجم البيض\n" +
                    "اسكبي الخليط في قالب مدهون بالزبدة ومرشوش بالدقيق الأبيض \n" +
                    "ادخليه الفرن على درجة 180 لمدة حوالي 20 دقيقة  "
        ),
        Food(
            R.drawable.recipe_6, "موسكوتشو بالقهوة",
            "المقادير\n" +
                    "\n" +
                    "3 بيضات ، كأس سكر، كأس زيت ، نصف كأس حليب , 2 ملاعق أكل نسكافي\n" +
                    "  15غ خميرة  كميائة ، علبة ياوورت طبيعي ( زبادي ) ، 2 كأس دقيق أبيض .\n" +
                    "طريقة التحضير:\n" +
                    "إمزجي البيض مع السكر جيدا\n" +
                    "أضيفي الزيت واستمري في المزج\n" +
                    "ذوبي القهوة في الحليب\n" +
                    "أسكبيها علا المزيج \n" +
                    "أضيفي علبة الياوورت ( الزبادي )\n" +
                    "غربلي الدقيق مع الخميرة \n" +
                    "أضيفي الدقيق وامزجي برفق \n" +
                    "أسكبي المزيج في قالب مدهون بالزبدة\n" +
                    "أدخلي القالب الى الفرن على درجة حرارة 180% مدة نصف ساعة\n" +
                    "بعدما تنضج المسكوتشو دعيها تبرد ثم زيينيها بالشكلاطة.\n"
        ),
        Food(
            R.drawable.recipe_7, "صابلي بدون بيض",
            "المقادير :\n" +
                    "2 علب ياوورت ( زبادي ) ,كوب زيت , 200غ زبدة , كوب سكر , كوب نشاء , بشر البرتقال , دقيق أبيض حسب الحاجة .\n" +
                    "طريقة التحضير \n" +
                    "نخلط الياوورت ( الزبادي ) مع السكر جيدا\n" +
                    "نضيف الزيت وبشر البرتقال ثم النشاء ونستمر في الخلط حتى تمتزج المكونات جيدا \n" +
                    "نضيف الدقيق تدريجيا حتى نحصل علا عجينة طرية \n" +
                    "نبسط العجينة بسمك 5 ملم \n" +
                    "نقوم بتقطيعها بواسطة قالب بالشكل الذي تريدينه\n" +
                    "نطهو الحلوي في فرن ساخن علا درجة حرارة 180درجة \n" +
                    "اخرجي الصابلي من الفرن وألصقي كل حبتين مع بعض بستعمال المربى .\n" +
                    "بعد ان تبرد الحلوى يمكني اضافة تزيين أو تركها كما هي حسب الرغبة "
        ),
        Food(
            R.drawable.recipe_8,
            "حلوة الفرشيطة بالشكولاطة والمربى ",
            "المقادير : \n" +
                    "3 حبات بيض ، كأس غير مملوء تماما زيت ، نصف كأس سكر خشن ، مبشور برتقال او ليمون او فانيليا حسب الرغبة انا إستعملت مبشور البرتقال ، كيس خميرة كيميائية ، 3 ملاعق نشاء ،3 كؤوس فرينة ( دقيق ابيض ) ممكن اكتر ممكن اقل حسب نوعية الدقيق ، علبة شكلاطة ومربى المشمش للتزيين .\n" +
                    "طريقة التحضير : \n" +
                    "نخلط البيض و السكر و الزيت ومبشور البرتقال حتى يذوب السكر تماما \n" +
                    "نضيف النشاء وكيس الخميرة ونحرك \n" +
                    "نضيف الفرينة ( دقيق أبيض ) ونحرك حتى نحصل على عجين متماسك\n" +
                    "نشغل الفرن على حرارة 200 درجة مئوية \n" +
                    "ندهن قالب بقليل من الزيت \n" +
                    "نشكل كريات من العجين \n" +
                    "نضعها في القالب ثم نضغط على كل واحدة بالفرشات حتى نحصل على شكل الخطوط \n" +
                    "نضع القالب في الفرن لمدة حوالي عشر دقائق الى ربع ساعة حسب حرارة الفرن\n" +
                    "نذيب الشكلاطة في حمام ماري \n" +
                    "نلصق كل حبتين بالمربى ونضع طرف الحبة في الشكلاطة كما هو ظاهر في الصورة \n" +
                    "نصائح : \n" +
                    " إصنعي هذه حلوة الفرشيطة بسرعة لأن العجين يتششق إذا ترك لمدة طويلة قبل الطهي ."
        ),
        Food(
            R.drawable.recipe_9, "كيك بالبرتقال والإجاص",
            "المقادير:\n" +
                    " 2 بيض ، 2 إجاص ، حبتين مندرين (برتقال صغير ) ، نصف كوب سكر ، 3/4 كوب زيت ، كوب ماء ، كوب ونصف دقيق ، نصف كوب فرينة ( دقيق ابيض ) ، 20غ خميرة .\n" +
                    "للسيرو ( الشراب ) :\n" +
                    "كأسين ماء ، كأس سكر ، حبة برتقال صغيرة .\n" +
                    "طريقة التحضير :\n" +
                    "في خلاط كهربائي نخلط البرتقال منزوع العضام  وبشر البرتقال مع الماء السكر والزيت\n" +
                    "نضيف الدقيق والفرينة ( دقيق أبيض ) و الخميرة ونخلط لمدة حوالي خمس دقائق \n" +
                    "نسكب الخليط في قالب مدهون بالزيت ومرشوش بالدقيق \n" +
                    "نضع فوقها شرائح إجاص رقيقة \n" +
                    "نطهوها في فرن 180 درجة لمدة 40 دقيقة تقريبا حسب نوعية الفرن \n" +
                    "بعد نزعها من الفرن مباشرتا نسقيها بالسيرو "
        ),
        Food(
            R.drawable.recipe_10, "البسبوسة بوصفة سهلة",
            "المقادير:\n" +
                    "4 كؤوس ماء , 2 كأس سكر , قطعة ليمون ، أو برتقال\n" +
                    "طريقة التحضير:\n" +
                    "ضعي جميع المكونات في وعاء على نار خفيفة \n" +
                    " اتركيه يغلى لمدة حوالي 10 دقائق \n" +
                    "قوام السيرو مرتبط بمدة طهيه كلما طالت المدة اصبح قوامه غليضا وكلما قلت كان القوام خفيفا\n" +
                    "تحضير السيرو يكون عادتا قبل تحضير الحلويات فهو يستخدم غالبا بارد .\n" +
                    "\n" +
                    "طريقة التحضير:\n" +
                    "اخلطي البيض مع السكر وبشر اليمون .\n" +
                    "اضيفي الحليب والزيت \n" +
                    "اضيفي خليط السميد والفرينة والخميرة و حركي جيدا\n" +
                    "اسكبي الخليط في قالب مدهون بالزبدة ومرشوش بالفرينة ( دقيق ابيض ) .\n" +
                    "إطهيها في فرن 180 درجة مدة 25 دقيقة \n" +
                    "إنزعيها من الفرن وسكبي فوقها الشراب .\n" +
                    "إذا كانت البسبوسة ناشفة حتى بعد سكب الشراب والإنتضار قليلا فهذا يعود إلى نوعية الدقيق يمكنكي تحضير كمية إضافية و إضافتها إلى البسبوسة لكن بحذر"
        ),
        Food(
            R.drawable.recipe_11,
            "بيسكوي رولي سريع بمعجون المشمش",
            "المقادير :\n" +
                    "خمس حبات بيض ، خمس ملاعق أكل سكر خشن ،\n" +
                    "خمس ملاعق كبيرة زيت ، خمس ملاعق كبيرة فرينة ( دقيق أبيض ) ، نصف كيس خميرة كيميائية ، ملعقة كبيرة سكر فنيليا .\n" +
                    "طريقة التحضير :\n" +
                    "قبل البدء في التحضير شغلي الفرن على حرارة متوسطة و اتركيه يسخن \n" +
                    "إخفقي البيض بالخلاط الكهربائي مع السكر لمدة حوالي سبع دقائق حتى يتضاعف قوامه \n" +
                    "أضيفي الزيت و حركي بملعقة حتى يمتزج\n" +
                    "أضيفي مزيج الفرينة ( الدقيق الأبيض ) مع الخميرة الكيميائية وسكر الفنيليا \n" +
                    "حركي برفق باستعمال الملعقة \n" +
                    "إفرشي قالب الفرن بورق الطهي \n" +
                    "أفرغي البيسكوي رولي  وحركي القالب برفق حتى يصل إلى جميع الجوانب\n" +
                    "أدخليه إلى الفرن مسخن مسبقا ( ضروري ) على درجة حرارة متوسطة \n" +
                    "أتركي البيسكوي رولي يطهى مدة 10 دقائق تماما \n" +
                    "إنزعيه من الفرن \n" +
                    "إدتركيه يرتاح مدة أربع دقائق \n" +
                    "ادهني السطح بالمربى وقومي بلف البيسكوي رولي ونزع الورق مع كل لفة \n" +
                    "انثري فوق البيسكوي السكر الناعم أو زينيه حسب رغبتك"
        ),
        Food(
            R.drawable.recipe_12, "مادلين بالشوكولاطة",
            "\n" +
                    "طرق تزيين المادلان :\n" +
                    "هناك عدة طرق لتزيين المادلان من بينها \n" +
                    "\n" +
                    "التزيين بكريمة الزبدة مع قطع الحلوى الصغيرة الملونة أو حبات الشكوكولاطة \n" +
                    "التزيين بغاناش الشكولاطة \n" +
                    "التزيين بعجينة السكر ( هناك عدة أشكال)\n" +
                    "التزيين بعجينة اللوز \n" +
                    "\n" +
                    "المقادير:\n" +
                    "4 بيضات ، كأس سكرعادي ، نصف كأس زيت نباتي ( عباد الشمس )، 2 كأس فرينة ( دقيق ابيض ) ،20غ كاكاو ، 10غ خميرة كميائية ، ملعقة فانيليا\n" +
                    "طريقة التحضير:\n" +
                    "نخلط البيض والسكر جيدا\n" +
                    "نضيف الزيت ونستمر في الخلط\n" +
                    "نخلط المواد الجافة معا\n" +
                    "نضيفها على خليط البيض والسكر\n" +
                    "نحرك برفق حتى تمتزج جميع المكونات\n" +
                    "نفرغ العجين في قوالب مادلين\n" +
                    "ندخلها الفرن مدة ربع ساعة\n" +
                    "عندما تنضج نخرجها ونتركها تبرد\n" +
                    "يمكنكي تقديمها كما هي أو تزيينها بالسكر الناعم أو بغناش الشوكولاطة."
        ),
        Food(
            R.drawable.recipe_13, "حلوة البيستولي",
            "طريقة تحضير حلوة البيستولى\n" +
                    "هذه الوصفة لحوى تقليدية جزائرية كانت تسمى أيضا حلوة الماشينة أي الماكينة باللغة العربية الفصحى هذه الوصفة مهدات خصيصا إلى جيل التسعينات ستذكركم هذه الحلوة حتما بأيام العيد في ذلك الوقت حضروها واستمتعو بالذكريات الجميلة\n" +
                    "\n" +
                    "المقادير:\n" +
                    "كوب وربع كوب زيت , 3 حبات بيض ، كوب سكر ، 500 غرام فرينة ( دقيق أبيض ) ، كيس سكر فنيليا ، كيس خميرة كيميائية ،\n" +
                    "للتزيين :\n" +
                    "كوب مربى مشمش ، كوب جوز الهند مطحون\n" +
                    "طريقة التحضير:\n" +
                    "أخلط السكر مع البيض حتى يذوب السكر\n" +
                    "نضيف الزيت ونحرك جيدا\n" +
                    "نخلط الفرينة ( دقيق أبيض ) مع الخميرة والفنيليا ونضيفعا على دفعتين إلى الخليط مع التحريك حتى نتحصل على عجين متماسك لا يلتصق باليدين\n" +
                    "نشكل اسطوانة من العجين ونضعها داخل الماكيمة ونغلقها بستعمال الأسطوانة التي تحمل الشكل الذي نريد تحضيره أنا إخترت الوردة\n" +
                    "ندهن صينية الفرن بالزيت\n" +
                    "نصنع حبات الحلوى بالضغط على الماكينة كل مرة\n" +
                    "عندما تمتلئ الصينية ندخلها الفرن على درجة 180 لمدة حوالي ربع ساعة حسب نوعية الفرن \n" +
                    "عندما تبرد الحلوى ألصقي كل حبتين بالمربى \n" +
                    "إدهني الحواف بالمربى واغمسيها في جوز الهند المطحون \n" +
                    "نصائح :\n" +
                    "أتركي مسافة 1 سنتيمتر بين كل حبة لكي لا تلتصق ببعضها في الفرت \n" +
                    "لا تتركي العجينة تترتاح فذلك يتسبب في تشقق الحلوى\n"
        ),
        Food(
            R.drawable.recipe_14,
            "بسبوسة محشية بالكريمة",
            "\n" +
                    "المكونات :\n" +
                    "هذه المكونات لطبقة الأولى ستحتاجين لنفس المكونات وبنفس الكمية لتحضير الطبقة السطحية للبسبوسة .\n" +
                    "كأس دقيق ، 2 حبات بيض ، 2 ملاعق أكل سكر ، كيس خميرة كيميائية ، نصف كأس زيت ، نصف كأس حليب . \n" +
                    "مكونات الكريمة :\n" +
                    "نصف لتر حليب ، 2 ملاعق سكر ، 3 ملاعق نشاء ، كأس كريمة طازجة \n" +
                    "طريقة تحضير الشراب (السيرو ) للحلويات\n" +
                    "المقادير:\n" +
                    "4 كؤوس ماء , 2 كأس سكر , قطعة ليمون ، أو برتقال\n" +
                    "طريقة التحضير:\n" +
                    "ضعي جميع المكونات في وعاء على نار خفيفة \n" +
                    " اتركيه يغلى لمدة حوالي 10 دقائق \n" +
                    "قوام السيرو مرتبط بمدة طهيه كلما طالت المدة اصبح قوامه غليضا وكلما قلت كان القوام خفيفا\n" +
                    "تحضير السيرو يكون عادتا قبل تحضير الحلويات فهو يستخدم غالبا بارد .\n" +
                    "طريقة التحضير : \n" +
                    "حضري الطبقة الأولى للبسبوسة\n" +
                    "إخفقي بيضتين مع ملعقتين سكر \n" +
                    "أضيفي نصف كأس زيت نصف كأس حليب بشور الليمون إمزجي الكل جيدا\n" +
                    "أضيفي كوب من الدقيق مع 10 غرام خميرة \n" +
                    "حركي حتى تحصلي على خليط متجانس\n" +
                    "ادهني صينية الفرن بالزبدة ورشي عليها الدقيق\n" +
                    "أفرغي الخليط وأدخليه الفرن على درجة حرارة متوسطة حوالي ربع ساعة حتى ينضج تماما\n" +
                    "في هذه الأثناء حضري الكريمة \n" +
                    "إخلطي الحليب والسكر و النشاء جيدا \n" +
                    "ضعي الخليط على النار وحركي باستمرار حتى تحصلي على كريمة\n" +
                    "إنزعيها من النار وأضيفي الكريمة الطازجة\n" +
                    "حركي حتى تمتزج جيدا \n" +
                    "اخرجي الطبقة الأولى من الفرن و ضعي عليه الكريمة يجب ان تغطي الكريمة طبقة العجين \n" +
                    "سوي السطح جيدا \n" +
                    "حضري الطبقة الثانية من العجين بنفس الطريقة اللتي حضرتي بها الطبقة الأولى\n" +
                    "أفرغيها فوق طبقة الكريمة \n" +
                    "شغلي الفرن في الجهة العلوية فقط على نار هادئة حتى تنضج وتتحمر\n" +
                    "أخرجيها وأفرغي عليها كأس ونصف من الشراب \n" +
                    "دعيها تبرد تماما حوالي خمس ساعات ثم قومي بتقطعيها وتزيينها.ر"
        )

    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toggle = ActionBarDrawerToggle(this, drawerLayout,
            R.string.open,
            R.string.close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // set back button when drawer is open
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // select menu item
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.mi_juices_activity -> {
                    val intentJuicesActivity = Intent(this, JuicesScreenActivity::class.java)
                    startActivity(intentJuicesActivity)
                }
            }
            true
        }

        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.setHasFixedSize(true)

        recycle_view.adapter = CustomAdapter(this, foodList) {
                // item when item clicked
                val intent = Intent(
                    this,
                    FoodDetailActivity::class.java
                )
                intent.putExtra(
                    INTENT_PARCELABLE,
                    it
                )
                startActivity(intent)
        }
    }




    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
