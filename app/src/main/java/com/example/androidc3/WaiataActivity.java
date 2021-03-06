package com.example.androidc3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidc3.Adapter.GridOfCharAdapter;
import com.example.androidc3.Adapter.ListOfCharAdapter;
import com.example.androidc3.Model.WaiataModel;

import java.util.ArrayList;

import static maes.tech.intentanim.CustomIntent.customType;

public class WaiataActivity extends AppCompatActivity {
    private ArrayList<WaiataModel> charList = new ArrayList<>();
    private GridOfCharAdapter gridOfCharAdapter;
    private ListOfCharAdapter listOfCharAdapter;
    private RecyclerView charRecyclerview;
    private Toolbar toolbar;
    private GridLayoutManager gridLayoutManager;
    private int span_count_1 = 1, span_count_2 = 2;
    Intent intent;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiata);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Waiata");



        //toolbar = findViewById(R.id.toolbarList);
        //store the value in the form of array


        charList.add(new WaiataModel(1,R.drawable.ekorekoeengaro, "E Kore Koe E Ngaro",
                "This waiata was composed by members of local kapahaka " +
                "Te Iti Kahurangi, as a tribute to the ongoing support the group has received from Wintec over the years.\n\n" +
                "It references names and stories associated with our marae, including the wharenui 'Te Kākano a te kaahu', " +
                "the interior carving 'Tāwhaki', the large memorial pillar dedicated to the late Māori Queen 'Te Atairangikaahu', " +
                "and the three buildings which represent 'Ngā Kete Wānanga', the three baskets of knowledge.\n\n" +
                "When performing this waiata, the last line 'E ko Te Kuratini o Waikato' may also be sung at the beginning as an intro, and also repeated at the end.\n\n\n",
                "To Waikato Institute of Technology\n\n" +
                        "You are not lost, seed of heaven\n" +
                        "Kākano a te kāhu stand tall\n" +
                        "Te Kōpū Mānia, cultivate new growth\n" +
                        "Foster this person of the world\n\n" +
                        "Matariki on display, draw in all canoes\n" +
                        "Bind them to the posts of support and care\n" +
                        "Te Atairangikaahu, fly above\n" +
                        "Kīngi Tūheitia, hold steadfast below\n\n" +
                        "Tāwhaki ascend, prepare the house\n" +
                        "For the three baskets of knowledge\n" +
                        "Bind them, fasten them\n" +
                        "To Waikato Institute of Technology\n\n\n",
                "E ko Te Kuratini o Waikato e\n\nE kore koe e ngaro he kākano i ruia\n" +
                "Kākano a te Kaahu e tū nei e\n" +
                "Te Kōpū Mānia, te ngāwhā whakatupu\n" +
                "Ka tupu he tangata, rere ki te ao\n\nHorahia Matariki, kūmea ngā waka\n" +
                "Herea ki te pou o te aroha e\n" +
                "Te Atairangikaahu, tāiri kei runga\n" +
                "Ko Kīngi Tūheitia ki te whenua e\n\nPiki ake Tāwhaki, tāhūhū matapū\n" +
                "Ngā kete wānanga e toru e\n" +
                "Whītikitia rā, ka turuturu iho\n" +
                "E ko Te Kuratini o Waikato e.\n\n\n",
                "ویکیاتو انسٹی ٹیوٹ آف ٹکنالوجی کو\n" +
                        "\n" +
                        "آپ کھوئے نہیں ، جنت کا بیج\n" +
                        "Kākano a te Kaahu کھڑے ہوکر کھڑے ہوں\n" +
                        "Te Kōpū Mānia ، نیا گوتھ کاشت کریں\n" +
                        "دنیا کے اس شخص کی پرورش کریں\n" +
                        "\n" +
                        "Matariki ڈسپلے پر ، تمام کینو میں ڈرا\n" +
                        "ان کی مدد اور نگہداشت کے عہدوں پر پابند ہوں\n" +
                        "Te Atairangikaahu ، اوپر اُڑیں\n" +
                        "Kīngi Tūheitia ، نیچے ثابت قدم رہیں\n" +
                        "\n" +
                        "چڑھاو، گھر تیار\n" +
                        "علم کی تین ٹوکریوں کے لئے\n" +
                        "ان کو باندھ دو ، ان کو جکڑ دو\n" +
                        "ویکیاتو انسٹی ٹیوٹ آف ٹکنالوجی کو\n\n\n",R.raw.ekorekoe_1,R.raw.ekorekoe_3 ));
        charList.add(new WaiataModel(2,R.drawable.hemaimaiarohanatawhiao, "He Maimai Aroha nā Tāwhiao",
                "After the devastation of the Waikato raupatu or land confiscations of 1863, Kingi Tāwhiao sought refuge in Maniapoto" +
                        "or the King Country. After nearly two decades, in the early 1880s he made an emotional return to Waikato.\n\n" +
                        "This lament express his deeply felt sorrow for the land and its meaning to him. It includes in the lyrics the name of our" +
                        "marae, Te Kōpū Mānia o Kirikiriroa.\n\n\n",
                "I look down on the valley of Waikato,\n" +
                        "As though to hold it in the hollow of my hand\n" +
                        "And caress its beauty\n" +
                        "Like some tender verdant thing.\n\n" +
                        "I reach out from the top of Pirongia\n" +
                        "As though to cover and protect its\n" +
                        "Substance with my own.\n\n" +
                        "See how it bursts through the full bosoms\n" +
                        "Of Maungatautari and Maungakawa,\n" +
                        "Hills of my inheritance\n" +
                        "The river of life, each curve more beautiful\n" +
                        "Than the last.\n\n" +
                        "Crossing the smooth belly of Kirikiriroa,\n" +
                        "Its gardens bursting with fullness of the rich\n" +
                        "Eart towards the meeting place at\n" +
                        "Ngāruawāhia.\n\n" +
                        "There on the fertile mound i would rest\n" +
                        "My head\n" +
                        "And look through the thighs of\n" +
                        "Taupiri\n\n" +
                        "There at the place of all creation\n" +
                        "Let the King come forth.\n\n\n",
                "Ka mātakitaki iho au ki te riu o Waikato\n" +
                        "Anō nei hei kapo kau ake māku\n" +
                        "Ki te kapu o taku ringa,\n" +
                        "Ka whakamiri noa I tōna aratau,\n" +
                        "E tia nei he tupu pua hou.\n\n" +
                        "Kia hiwa ake au I te tihi o Pirongia,\n" +
                        "Inā hei toronga whakaruruhau mōna\n" +
                        "Ki tōku tauawhirotanga.\n\n" +
                        "Anā! Te ngoto o tōna ngāwhā\n" +
                        "I ōna uma kīhai I ārikarika\n" +
                        "A Maungatautari, a Maungakawa,\n" +
                        "Ōku puke maunga, ngā taonga tuku iho:\n" +
                        "Hoki ake nei au ki tōku awa koiora\n" +
                        "Me ōna pikonga\n" +
                        "He kura tangihia o te mātāmuri.\n\n" +
                        "E whakawhiti atu ai I te kōpū mānia\n" +
                        "O Kirikiriroa\n" +
                        "Me ōna māra kai, te ngāwhā whakatupu\n" +
                        "Ake o te whenua mōmona,\n" +
                        "Hei kawe ki Ngāruawāhia,\n" +
                        "Te huinga o te tangata.\n\n" +
                        "Arā, te pae haumako, hei okiokinga mō\n" +
                        "Taku upoko,\n" +
                        "Hei tirohanga atu mā raro I ngā hūhā\n" +
                        "O Taupiri.\n\n" +
                        "Kei reira rā, kei te oroko hanganga o te tangata\n" +
                        "Wāhia te tungaroa o te whare,\n" +
                        "Te whakaputanga mō te Kīngi.\n\n\n",
                "Waikato\n" +
                        "چائے پانی میں ڈوبیں\n" +
                        "جیسے ہی یہ منہ پر بڑھتا ہے\n" +
                        "Waikato دریا ہے\n" +
                        "ہر موڑ پر وہاں رہتا ہے\n" +
                        "ایک چیف۔\n" +
                        "\n" +
                        "ہوشیار رہو ایسا نہ ہو کہ آپ کیپسائز دیں\n" +
                        "دھارے مضبوط ہیں\n" +
                        "Waikato میں\n" +
                        "فاصلے پر اپنی نگاہیں درست کریں\n" +
                        "جہاں Taupiri پہاڑ ہے\n" +
                        "اور Pōtatau آدمی۔\n" +
                        "\n" +
                        "اپنے کینو کو پیڈل کریں Ngāruawāhia\n" +
                        "ٹو Tūrangawaewae\n" +
                        "مملکت کا دل\n" +
                        "جہاں Matutaera نے اپنا ماتم ختم کیا\n" +
                        "افسوس ، مجھے بھی غم کرنے دو\n\n\n", R.raw.hemaimaiaroha_1,R.raw.hemaimaiaroha_3 ));
        charList.add(new WaiataModel(3,R.drawable.waikatoteawa, "Waikato Te Awa",
                "Mr Harrison, the author of this poem, writes that 'When working on the different hydro works on the Waikato River, " +
                        "I spent quite a few hours of leisure, marvelling at the greatness of the dams and lakes formed on this waterway. " +
                        "So, in my spare time i made up this poetry about the Waikato River'.\n\n" +
                        "This was published in the historical Te Ao Hou magazine in June 1962, issue 29. Over the years, there have been slight adjustments" +
                        "to the poem to suit the context of todays's communities. Wintec only sings the first three verses.\n\n\n",
                "Waikato te awa\nDip in the water\nAs it surges at the mouth\nWaikato is the river\n" +
                        "At every bend there lives\n A chief.\n\n" +
                        "Be careful lest you capsize\nFor the currents are strong\nin the Waikato\n" +
                        "Fix your gaze on the distance\nWhere Taupiri is the mountain\nAnd Pōtatau the man.\n\n" +
                        "Paddle your canoe to Ngāruawāhia\nTo Tūrangawaewae\n" +
                        "The heart of the kingdom\nWhere Matutaera finished his lament\nAlas, let me grieve also.\n\n\n",
                "Waikato te awa\n" +
                        "Katohia, katohia he wai māu\n" +
                        "Katohia he wai māu\n" +
                        "Ka eke ki Te Pūaha o Waikato\n" +
                        "Te awa; he piko, he taniwha\n" +
                        "He piko, he taniwha\n\n" +
                        "Kia tūpato rā kei tahuri koe\n" +
                        "I ngā au kaha o Waikato\n" +
                        "Whakamau tō titiro ki tawhiti rā\n" +
                        "Ko Taupiri te maunga\n" +
                        "Pōtatau te tangata\n" +
                        "Te mauri o te motu e\n\n" +
                        "E hoe tō waka ki Ngāruawāhia\n" +
                        "Tūrangawaewae mō te ao katoa\n" +
                        "Te tongi whakamutunga a Matutaera\n" +
                        "Auē hoki auē\n\n\n",
                "میں Waikato والی والی طرف دیکھتا ہوں ،\n" +
                        "گویا اسے میرے ہاتھ کے کھوکھلے میں تھامنا ہے\n" +
                        "اور اس کی خوبصورتی کو دلاتا ہے\n" +
                        "کچھ نرم چیزوں کی طرح\n" +
                        "\n" +
                        "میں Pirongia کے اوپر سے پہنچتا ہوں\n" +
                        "گویا اس کا احاطہ اور حفاظت کرنا ہے\n" +
                        "میرے اپنے ساتھ مادہ۔\n" +
                        "\n" +
                        "ملاحظہ فرمائیں کہ یہ پوری طرح سے پھٹ جاتا ہے\n" +
                        "Maungatautari اور Maungakawa ،\n" +
                        "میری وراثت کی پہاڑیوں\n" +
                        "زندگی کا دریا ، ہر وکر زیادہ خوبصورت\n" +
                        "آخری کے مقابلے میں۔\n" +
                        "\n" +
                        "Kirikiriroa کا ہموار پیٹ عبور کرنا ،\n" +
                        "اس کے باغات امیروں کی خوشنودی کے ساتھ پھٹ رہے ہیں\n" +
                        "ملاقات کی جگہ کی طرف زمین\n" +
                        "Ngāruawāhia۔\n" +
                        "\n" +
                        "وہاں زرخیز ٹیلے پر میں آرام کروں گا\n" +
                        "میرا سر\n" +
                        "اور رانوں کو دیکھو\n" +
                        "Taupiri\n" +
                        "\n" +
                        "تمام مخلوقات کی جگہ پر\n" +
                        "بادشاہ کو سامنے آنے دو۔\n\n\n", R.raw.waikatoteawa_1,R.raw.waikatoteawa_3 ));
        charList.add(new WaiataModel(4,R.drawable.tutiramaingaiwi, "Tūtira mai ngā iwi",
                "Wi Huata wrote this song and taught it to this children whilst on a family gathering to lake Tutira, north of Napier.\n\n" +
                        "He was explaing how the iwi came together here to support each other.\n\n" +
                        "Later he used this song to promote Moral Re-armament, uniting different cultures.\n\n\n",
                "Line up together, people\n" +
                        "All of us, all of us. \n" +
                        "Stand in rows, people \n" +
                        "All of us, all of us.\n" +
                        "Seek after knowledge\n" +
                        "and love of others, everybody!\n" +
                        "Be really virtuous\n" +
                        "And stay united. \n" +
                        "All of us, all of us.\n\n" +
                        "Line up together, people\n" +
                        "All of us, all of us. \n" +
                        "Stand in rows, people \n" +
                        "All of us, all of us.\n" +
                        "Seek after knowledge\n" +
                        "and love of others, everybody!\n" +
                        "Be really virtuous\n" +
                        "And stay united. \n" +
                        "All of us, all of us.\n\n" +
                        "All of us, all of us\n" +
                        "Hi aue hei\n\n\n",
                "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Whaia te maramatanga\n" +
                        "Me te aroha, e ngā iwi\n" +
                        "Kia ko tapatahi\n" +
                        "Kia kotahi rā.\n" +
                        "Tātou tātou e.\n\n" +
                        "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Tūtira mai ngā iwi\n" +
                        "Tātou tātou e\n" +
                        "Whaia te maramatanga\n" +
                        "Me te aroha, e ngā iwi\n" +
                        "Kia ko tapatahi\n" +
                        "Kia kotahi rā.\n" +
                        "Tātou tātou e.\n\n" +
                        "Tātou, tātou E\n" +
                        "Hi aue hei\n\n\n" +
                        "",
                "لوگ ، لوگ جمع کرو\n" +
                        "ہم سب ، ہم سب\n" +
                        "لوگو ، قطار میں کھڑے ہو جاؤ\n" +
                        "ہم سب ، ہم سب\n" +
                        "علم کی تلاش کریں\n" +
                        "اور دوسروں کی محبت ہر ایک سے\n" +
                        "واقعی نیک بخت اور متحد رہیں۔\n" +
                        "ہم سب ، ہم سب\n" +
                        "\n" +
                        "لوگ ، لوگ جمع کرو\n" +
                        "ہم سب ، ہم سب\n" +
                        "لوگو ، قطار میں کھڑے ہو جاؤ\n" +
                        "ہم سب ، ہم سب\n" +
                        "علم کی تلاش کریں\n" +
                        "اور دوسروں کی محبت ہر ایک سے\n" +
                        "واقعی نیک بخت اور متحد رہیں۔\n" +
                        "ہم سب ، ہم سب\n" +
                        "\n" +
                        "ہم سب ، ہم سب\n" +
                        "ہیلو آیو ہی\n\n\n", R.raw.tutiramainga_1,R.raw.tutiramainga_3 ));
        charList.add(new WaiataModel(5,R.drawable.pupuketehihiri, "Pupuke Te Hihiri",
                "Nā Nganehu Turner ngā kupu, nā Tania Oxenham te rangi © 2004 Nganehu Turner (Ngāti Maniapoto) held the position of pouako (tutor) " +
                        "of Te Reo Māori and kuia at Wintec for manny years.\n\n" +
                        "This was one of the songs she dedicated to the Māori students of Wintec, all who hoped to see their aspirations fulfilled.\n\n\n",
                "Ascend Son, Daughter\n To the pinnacle of Wintec\n Hold fast to quality principles\n" +
                        "That reflect your successes\n" +
                        "Ascend Son, Daughter\n To the pinnacle of Wintec\n Hold fast to quality principles\n" +
                        "That reflect your successes\n\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n\n" +
                        "From the basets of knowledge Tāwhaki retrieved\n" +
                        "Comes spirit, life-force, power, language,\n" +
                        "Understanding and Knowledge\n" +
                        "The isthmus of Culture.\n\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n" +
                        "From conception the increase\n From increase the thought\n" +
                        "From throught the knowledge out of Chaos\n\n\n" ,
                "Piki ake e tama e Hine\n" +
                        "I te ahurei o te Kuratini o Waikato\n" +
                        "He mātāpono whakaū kounga\n" +
                        "Ka whakaata i te angitū" +
                        "Piki ake e tama e Hine\n" +
                        "I te ahurei o te Kuratini o Waikato\n" +
                        "He mātāpono whakaū kounga\n" +
                        "Ka whakaata i te angitū\n\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n\n" +
                        "Nō ngā kete i pikihia e Tāwhaki\n" +
                        "He wairua, he mauri, he mana, he reo\n" +
                        "He māramatanga, he mātauranga\n" +
                        "He iho o te ahurea\n\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n" +
                        "Pupuke te hihiri\n" +
                        "Pupuke te mahara\n" +
                        "Pupuke te wānanga a te Kore\n\n\n",
                "بیٹا چڑھ جاؤ ، بیٹی\n" +
                        "ونٹیک کے عہدے تک\n" +
                        "کوکیٹی اصولوں کو مضبوطی سے تھامے\n" +
                        "جو آپ کی کامیابیوں کی عکاسی کرتا ہے\n" +
                        "بیٹا چڑھ جاؤ ، بیٹی\n" +
                        "Wintec کے عہدے تک\n" +
                        "کوکیٹی اصولوں کو مضبوطی سے تھامے\n" +
                        "جو آپ کی کامیابیوں کی عکاسی کرتا ہے۔\n" +
                        "\n" +
                        "تصور سے اضافہ\n" +
                        "سوچ میں اضافہ سے\n" +
                        "افکار سے افکار افکار سے\n" +
                        "تصور سے اضافہ\n" +
                        "سوچ میں اضافہ سے\n" +
                        "افکار سے افکار افکار سے۔\n" +
                        "\n" +
                        "Tāwhakiretrived علم کی ٹوکری سے\n" +
                        "روح ، زندگی کی طاقت ، طاقت ، زبان ،\n" +
                        "افہام و تفہیم\n" +
                        "ثقافت کا isthmus.\n" +
                        "\n" +
                        "تصور سے اضافہ\n" +
                        "سوچ میں اضافہ سے\n" +
                        "افکار سے افکار افکار سے\n" +
                        "تصور سے اضافہ\n" +
                        "سوچ میں اضافہ سے\n" +
                        "افکار سے افکار افکار سے۔\n\n\n", R.raw.pupuketehihiri_1,R.raw.pupuketehihiri_3 ));
        charList.add(new WaiataModel(6,R.drawable.itewharewhaapiri, "I Te Whare Whakapiri",
                "This waiata was written by past Wintec students who came to Wintec to learn Te Reo Māori.\n\n" +
                        "The song exposes the effects colonization has had on their lives and encourage Wintec to be a pillar by" +
                        "which they and others following can restore what was lost.\n\n" +
                        "In this instance, it is the language which is the doorway to their cultural inheritance and well being.\n\n\n",
                "I am Māori\n\n" +
                        "In this cultural house\nThat is within Waikato Institute of Technology\nWe feel the sorrow\n" +
                        "The tears, The flow\nAnd the love.\n\n" +
                        "Give back our cultural inheritance\nNurture the development of my language\n" +
                        "That awakens my spirit.\n\n" +
                        "The nothingness has disappeared\nI begin to bloom\nI am Māori\nI am Māori\n\n\n",
                "He Māori tū tangata\n\n" +
                        "I te whare whakapiri a Tāne\n" +
                        "Roto te Kuratini o Waikato\n" +
                        "Ka puta ngā mamaetanga\n" +
                        "Rere iho ko ngā roimata\n" +
                        "Auē, te arohanui\n\n" +
                        "Homai, homai taku Māoritanga\n" +
                        "Whāngaihia mai tōku reo tuku iho\n" +
                        "He kaiwhakaoho i tōku wairua\n\n" +
                        "Kua ngaro te korekore\n" +
                        "Puāwai ana ko ahau\n" +
                        "He Māori tū tangata\n" +
                        "He Māori tū tangata\n\n\n",
                "میں ہوں Māori\n" +
                        "\n" +
                        "اس ثقافتی گھر میں\n" +
                        "یہ Waikato Institute of Technology کے اندر ہے\n" +
                        "ہمیں دکھ ہوتا ہے\n" +
                        "آنسو ، بہاؤ\n" +
                        "اور محبت۔\n" +
                        "\n" +
                        "ہماری ثقافتی وراثت کو واپس کرو\n" +
                        "میری زبان کی ترقی فطرت\n" +
                        "یہ میری روح کو بیدار کرتا ہے۔\n" +
                        "\n" +
                        "کچھ بھی مٹ گیا ہے\n" +
                        "میں کھلتا ہوں\n" +
                        "میں ہوں Māori\n" +
                        "میں ہوں Māori\n\n\n", R.raw.itewhare_1,R.raw.itewhare_3 ));
        charList.add(new WaiataModel(6,R.drawable.puateowhai, "Pua Te Kōwhai",
                "This waiata is suitable for any occasion and is still used both in and out of Wintec. The song jumps" +
                        "around as it follows the flight path of the Tui.\n\n" +
                        "Historically, the hill that Wintec sits on was part of the lands designated 'mara' or gardening land, thus," +
                        "the name Te Kōpū Mānia o Kirikiriroa - The Smooth Bellly (fertile lands) of Kirikiriroa (known persently" +
                        "as Hamilton).\n\n" +
                        "Waikato-Tainui, Ngāti Hauā and Ngāti Wairere are the mana whenua (known affiliated tribes) of this land.\n\n\n",
                "The kōwhai blooms\n" +
                        "Bursts open in readiness for plucking\n" +
                        "A sign of Spring\n" +
                        "The Tui begin to assemble\n" +
                        "To nibble to gather\n" +
                        "For life and well-being\n" +
                        "The stain of the kōwhai touches\n" +
                        "While Tui get drunk on the nectar of God\n" +
                        "Flittering away, returning\n" +
                        "A display of yello\n" +
                        "As the sun shines\n\n\n",
                "Pua te kōwhai\n" +
                        "Ngawhā te kōrari\n" +
                        "He tohu kōanga\n" +
                        "Tau mai e Tui ki tō kāpunipuni\n" +
                        "Honihoni, kohikohi\n" +
                        "Hei oranga, hei rongoā\n" +
                        "Pania te kiri ki te kōwhai kura\n" +
                        "E Tui haurangi i te tākoha o te Atua\n" +
                        "Rere atu, hoki mai\n" +
                        "Parea te ua kōwhai\n" +
                        "Ka whiti mai te rā e\n\n\n",
                "Kōwhai کھلتا ہے\n" +
                        "پلٹنے کے لئے تیاریوں میں برات کھلتے ہیں\n" +
                        "بہار کی علامت\n" +
                        "Tui جمع ہونا شروع ہو گئے\n" +
                        "اکٹھا ہونا\n" +
                        "زندگی اور فلاح و بہبود کے لئے\n" +
                        "Kōwhai چھو جانے والے داغ\n" +
                        "جبکہ Tui خدا کے امرت پر نشے میں پڑ گئے\n" +
                        "فلٹرنگ ، واپس لوٹنا\n" +
                        "پیلے رنگ کا ایک ڈسپلے\n" +
                        "جیسے جیسے سورج چمکتا ہے\n\n\n", R.raw.puatekowhai_1,R.raw.puatekowhai_3 ));

        gridOfCharAdapter = new GridOfCharAdapter(charList);
        listOfCharAdapter = new ListOfCharAdapter(charList);

        charRecyclerview = findViewById(R.id.recyclerview);

        //        for grid
        gridLayoutManager = new GridLayoutManager(this, span_count_2);
        charRecyclerview.setLayoutManager(gridLayoutManager);
        charRecyclerview.setItemAnimator(new DefaultItemAnimator());
        charRecyclerview.setAdapter(gridOfCharAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_topmenu, menu);
        menu.removeItem(R.id.itemhome);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 16908332://back
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                customType(this,"right-to-left");
                return true;
            case R.id.itemlist:
                swapView(item);
                return true;
            case R.id.itemaboutus:
                intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void swapView(MenuItem item){
        if(gridLayoutManager.getSpanCount() == span_count_2)
        {
            item.setIcon(R.drawable.ic_grid);
            gridLayoutManager.setSpanCount(span_count_1);
            charRecyclerview.setAdapter(listOfCharAdapter);
        }else if(gridLayoutManager.getSpanCount()==span_count_1)
        {
            item.setIcon(R.drawable.ic_list);
            gridLayoutManager.setSpanCount(span_count_2);
            charRecyclerview.setAdapter(gridOfCharAdapter);
        }

    }


}