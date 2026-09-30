
package com.zihadhossain.banglasongs;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayList(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();


		//=========================================================================
		//===========================ARIJIT SINGH =================================
		//==========================================================================
		addVideoItem("J2JQQm1h6xQ", "Bojhena Shey Bojhena | Arijit Singh |", "Bojhena Shey Bojhena (বোঝেনা সে বোঝেনা) | Title Track |Soham |Abir | Payel |Mimi | Arijit Singh |");
		addVideoItem("5L4ZLPKSVlY", "Parbona | Arijit ", "Parbona | Borbaad | Bonny | Rittika | Arijit | Prashmita | Arindom | Raj Chakraborty | ");
		addVideoItem("1f18irP--O8", "Tomake Chai | Arijit Singh", "Tomake Chai | Gangster | Yash | Mimi | Arijit Singh | Birsa Dasgupta | Latest Bengali Song 2016");
		addVideoItem("AbluPg_E14k", "Tor Ek Kothaye | Arijit Singh", "Tor Ek Kothaye | Besh Korechi Prem Korechi | Koel | Jeet | Arijit Singh | Jeet Gannguli");
		addVideoItem("TTkjAOt2i70", "Aami Tomar Kache  | Arijit Singh ", "Aami Tomar Kache | Yoddha | Dev | Mimi | Arijit Singh | Indraadip | Raj Chakraborty");
		addVideoItem("azLiK9wdxl8", "Na Re Na ( না রে না ) | Arijit Singh ", "Na Re Na ( না রে না ) | Bojhena Shey Bojhena | Soham | Mimi | Arijit Singh | Arindom ");
		addVideoItem("8NbpwbrJrFA", "Ke Tui Bol | Arijit Singh ", "Ke Tui Bol | Herogiri | Dev | Sayantika | Arijit Singh | Jeet Gannguli");
		addVideoItem("6SkQ-srIJVM", "Mon Bojhe Naa | Arijit Singh ", "Mon Bojhe Naa (মন বোঝে না) | Chirodini Tumi Je Amar 2 | Arjun Chakraborty | Arijit Singh ");
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("b6uPyqdvt4E", "Eka Ekela Mon | Arijit Singh |", "Eka Ekela Mon | Chirodini Tumi Je Amar 2 | Arjun Chakraborty | Arijit Singh |");
		addVideoItem("Tt-mCnzPK-o", "Aashona| Arijit ", "Aashona | Borbaad | Bonny | Rittika | Arijit | Prashmita | Arindom | Raj Chakraborty |");
		addVideoItem("DJa5iE0HZCU", "Title Track | Arijit Singh ", "Title Track | STJ | Dev | Srabanti | Mimi | Soham | Arijit Singh | Shreya Ghoshal |");
		addVideoItem("1TW1C96APiI", "URECHE MON  | ARIJIT SINGH ", "URECHE MON | BOSS 2 | JEET | SUBHASHREE | JEET GANNGULI | ARIJIT SINGH | BABA YADAV |");
		addVideoItem("lgvtusNiHQo", "Egiye de | Arijit Singh ", "Egiye de | Shudhu Tomari Jonyo | Dev | Srabanti | Arijit Singh | Madhubanti Bagchi | Arindom |");
		addVideoItem("l4SMhkflO9Q", "Dekhte Bou Bou | Shudhu Tomari Jonyo | Dev | Srabanti | Mimi | Soham | Birsa |", "");
		addVideoItem("EpUsuEmCRME", "Benche Theke Labh Ki Bol |  Arijit Singh ", "Benche Theke Labh Ki Bol | Rangbaaz | Dev | Koel | Arijit Singh | Jeet Gannguli");
		addVideoItem("IvE42H9aM8I", "Mamo Chitte | Arijit Singh  ", "Mamo Chitte | Rabindra Sangeet | Shakib Khan | Srabanti | Arijit Singh");
		//addVideoItem("", "", "");
		addVideoItem("TZ2zIjPSNJM", "Bismillah (বিসমিল্লা) | Arijit", "Bismillah (বিসমিল্লা) | Title Track | Subhashree, Riddhi | Arijit, Srijato, Indraadip ");
		addVideoItem("TKWBBIibTQc", "Ar Kono Kotha Na Bole| Arijit Singh", "Ar Kono Kotha Na Bole | Shakib Khan | Srabanti | Arijit Singh, Madhubanti | Shikari | Eskay movies");
		addVideoItem("CP2AYEqoaZo", "Bojhabo Ki Kore | Arijit |", "Bojhabo Ki Kore | Haripada Bandwala | Ankush | Nusrat | Arijit | Anwesshaa | Indraadip | Pathikrit");
		addVideoItem("b_CmWITKt9A", "Ebhabe Ke Daake | Arijit Singh ", "Ebhabe Ke Daake | Chengiz | Jeet | Susmita | Arijit Singh | Kaushik-Guddu | Imran | Prosen");
		addVideoItem("_DKjY1eTFws", "Shudhu Tomari Jonyo Arijit Singh", "Shudhu Tomari Jonyo (শুধু তোমারি জন্য) Lyrical | Arijit Singh, Shreya Ghoshal | Indraadip Dasgupta");
		addVideoItem("WC0OJogYB-w", "KEU JAANE NAA| ARIJIT SINGH", "KEU JAANE NAA | RAAVAN | JEET | ARIJIT SINGH | LAHOMA | SAVVY | IMRAN SARDHARIYA | PROSEN |");
		addVideoItem("DbXP1TqLwrs", "Sharatadin | Arijit ", "Sharatadin | Yoddha | Dev | Mimi | Arijit | Anwesshaa | Indraadip | Raj Chakraborty ");
		createPlayList("অরিজিৎ সিং         গান ", R.drawable.arijitsingh);



		//==========================================================================
		//============================ JAMES SONGS ==========================
		//==========================================================================
		addVideoItem("XyMThGRuu_A", "Tor Premete | Satta | James | ", "Tor Premete | Satta | James | Shakib Khan | Paoli Dam | Bangla movie song 2017");
		addVideoItem("mr5osZhWy1k", "Guru Ghor Banaila Ki DiyaDiya।James।", "গুরু ঘর বানাইলা কি দিয়া।।Guru Ghor Banaila Ki DiyaDiya।James।।| Bangla New Song 2022 |");
		addVideoItem("zZhFKxA8opM", "Pagla Hawar tore | James | ", "Pagla Hawa | পাগলা হাওয়া | James Songs | Nagar Baul James ");
		addVideoItem("_YWChp15DW8", "Asbar Kale Aslam Eka | James | ", "Asbar Kale Aslam Eka | James | 31st night live concert from Coxs Bazar");
		addVideoItem("p1yoQ83TG1k", "TAARAI TAARAI - NAGARBAUL JAMES ", "TAARAI TAARAI - NAGARBAUL JAMES with TAPOSH & FRIENDS : ROBI YONDER MUSIC WIND OF CHANGE");
		addVideoItem("Ry1VYARRVxg", "Amar sonar bangla | James | ", "আমার সোনার বাংলা | Amar sonar bangla | James | Bangla lyrics videos");
		//addVideoItem("EUOOR6gWkV8", "James || Maa | ", "James || Maa || Kolkata Nazrul Moncho.");
		addVideoItem("I92Q280g258", "MIRA BAAI - NAGARBAUL JAMES ", "MIRA BAAI - NAGARBAUL JAMES with TAPOSH & FRIENDS : ROBI YONDER MUSIC WIND OF CHANGE ");
		addVideoItem("gEQmBZsF9To", "BABA-বাবা |JAMES", "BABA-বাবা |Baba Kotodin Dekhina Tomay|James|Guitar Chord & Lyrics");
		addVideoItem("E7xDegBVRE4", " \"Shobi Bhul\" |JAMES", "|| James || New Song || \"Shobi Bhul\" || Presented by Bashundhara LPG ||");
		addVideoItem("_qsG72NrXco", "তোর সব কিছুতে নয় ছয়- James", "তোর সব কিছুতে নয় ছয়- James. Bangla song");
		addVideoItem("xTvuUDx0LIw", "O Bijli Chole Jeo Na at James", "O Bijli Chole Jeo Na at James Live in Adelaide 2022");
		addVideoItem("fq_6elPN8X8", "Diwana Mastana। James ।", "Diwana Mastana। দিওয়ানা মাস্তানা । James । জেমস । DESHTV MUSIC");
		addVideoItem("wnfUpOch510", "Kobita | James | ", "কবিতা তুমি স্বপ্নচারিনী হয়ে | Kobita | James | Lyrics");
		addVideoItem("behwxf-FezU", "Eto Kosto (এতো কষ্ট) Bangla Song", "Eto Kosto (এতো কষ্ট) Bangla Song | Arifin Shuvoo | James Song। Warning | SB Movie Songs");
		addVideoItem("nwl6PIAbCV0", "Likhte Parina kono Gaan - james", "Likhte Parina kono Gaan - james ।। With Lyrics video song");
		addVideoItem("yYyqD0bS7y4", "Dukhini dukkho korona-JAMES", "Dukhini dukkho korona (Original song) - James");
		addVideoItem("Stck2CSKFxc", "শূন্য করে - জেমস্", "শূন্য করে - জেমস্ || Sunno Kore Lyrics Song || ");
		addVideoItem("oBaW8PLcNwQ", "Mon Amar Pathorer Deyal By James", "Mon Amar Pathorer Deyal Se Ek By James !! মন আমার পাথরের দেয়াল সে এক জেমস !!");
		addVideoItem("dZyTlT3sld8", "Dukkho amar sathei ache (By James) ", "দুঃখ আমার সাথেই আছে | Dukkho amar sathei ache (By James) Nagar Baul");
		addVideoItem("g45L3Rh4ris", "James - Prithibi Bodle Gache", "James - Prithibi Bodle Gache (পৃথিবী বদলে গেছে বদলে গিয়েছ তুমি) ।। Nogor baul James");
		addVideoItem("nyirPYMKBrk", "Kusum Kusum Prem By James |", "Kusum Kusum Prem By James || Full Song Lyrics Video");
		addVideoItem("T5CXBoHyX8A", "কোন ফুলে দেবো পুজো তোমায় | James |", "কোন ফুলে দেবো পুজো তোমায় | James | Lyrical Video | Bangla New Song 2023");
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("ta_kjP2E3NU", "James || New Song || \"I Love You\" |", "|| James || New Song || \"I Love You\" || Presented by Bashundhara Spice ||");
		createPlayList("জেমস (গুরু)         গান ", R.drawable.james3);


		//==========================================================================
		//============================ MINAR RAHMAN SONGS ==========================
		//==========================================================================

		addVideoItem("RWnFowWtT78", "MINAR RAHMAN |JHOOM |", "You are watching One of the most popular Bangla Song: \"JHOOM by Minar Rahman\"");
		addVideoItem("e8eSfqaaGXQ", "Karone Okarone | Minar Rahman ", "Karone Okarone | Minar Rahman | Official Music Video | Eagle Music");
		addVideoItem("hdQbmcpLTdg", "Barabari - Minar Rahman | Mamo |", "Enjoy new bangla song-Barabari");
		addVideoItem("aM7LK2dGJDQ", "Minar Rahman - Shomoy | সময় |", "Minar Rahman - Shomoy | সময় | Official Lyrical Video | Bangla Song");
		addVideoItem("3fcs8SncEDs", "CHOKH | Minar | Mehedi Hasan Limon |", "CHOKH | Minar | Mehedi Hasan Limon | Mabrur Rashid Bannah | Minar Eid Song 2017");
		addVideoItem("y4W-hqPHr_w", "Tar Dekha Na Peye | Minar Rahman |", "Tar Dekha Na Peye | Minar Rahman | Musfiq R. Farhan | Tanjin Tisha | Kothay Khuji Tare Natok Song");
		addVideoItem("nJT--MlnCBk", "Aha Re || আহারে || Minar Rahman |", "Aha Re || আহারে || Minar Rahman | Taneem Rahman Angshu | Superhit Bangla Song | Official Music Video\n ");
		addVideoItem("13wqHPe3O1Y", " Minar Rahman - Ta Jani Na", "Minar Rahman - Ta Jani Na (Official Music Video) ");
		addVideoItem("Pm3KHU-edJo", "Minar Rahman - Shagorer Tirey ", "Minar Rahman - Shagorer Tirey ( Official Music Video 2022)");
		addVideoItem("5M1iSrNLtHE", "Minar Rahman | Tumi Tomar Moto | Lyrics | ", "Minar Rahman | Tumi Tomar Moto | Lyrics | মিনার রহমান | তুমি তোমার মত | লিরিক্স ");
		addVideoItem("zsyTCnM55V4", "Ghum Bhanga by Minar Rahman ", " Ghum Bhanga by Minar Rahman - SAYANTON ❤ SOURAVI CINEMATIC PREWEDDING 1080p - SKP © 2020");
		addVideoItem("NsIQzX6zQtQ", "Ekakitte || একাকিত্বে || Prince Mahmud Feat Minar |", " Ekakitte || একাকিত্বে || Prince Mahmud Feat Minar || Emon Chowdhury || New Official Lyrical Video");
		addVideoItem("mFVfDYjjX2k", "Pagol by Minar (পাগল মিনার) । ", "Pagol by Minar (পাগল মিনার) । Supto & Moumita | Exclusive Bangla Music Video | Full HD ");
		addVideoItem("gQN1p8Ywtic", "Shudhu Tumi ( শুধু তুমি ) | Minar | ", "Shudhu Tumi ( শুধু তুমি ) | Minar | With Lyric | Bangla Song ");
		addVideoItem("VGIydylesYA", "KHOJ | খোঁজ | Minar | ", "KHOJ | খোঁজ | Minar | Official Music Video | Bangla Song 2016");
		addVideoItem("GsBqGJSWXks", "Dhaka Mukhi Train By Minar Rahman|", "Dhaka Mukhi Train By Minar Rahman|SOBUJ| শিল্পী মিনার রহমান জনপ্রিয় গান");
		addVideoItem("2lo1_B1hRgI", "Chader Golpo | Bangla Song | Minar Rahman |", "Chader Golpo | Bangla Song | Minar Rahman | Apurba & Mehazabien | Natok er Gaan | Pichutan Natok");
		addVideoItem("cc8aA_3pPCs", "Golpogulo Amader | Title song | Minar Rahman |", "Golpogulo Amader | Title song | Minar Rahman | Sajid Sarker | Mizanur Rahman Aryan");
		addVideoItem("iMhIJTQ6GsE", "MINAR | HARIYE KOTHAY | ", "MINAR | HARIYE KOTHAY | Arfan Nisho | Momo | OST 'Soulmate' Telefilm | New Bangla Song");
		addVideoItem("ClS9i2cIEjg", "Ki Tomar Naam | ft. Minar Rahman | ", "Ki Tomar Naam | ft. Minar Rahman | GaanchillMusic | Bangla Song Lyrics");
		createPlayList("মিনার রহমান         গান ", R.drawable.minar);



		//=========================================================================
		//======================== AYUB BACHCHU  SONGS================================
		//=========================================================================
		addVideoItem("zIKuIugm0TY", " Haste Dekho Gaite Dekho - Ayub Bacchu", "হাসতে দেখ গাইতে দেখ - আইয়ুব বাচ্চু || Haste Dekho Gaite Dekho - Ayub Bacchu");
		addVideoItem("SYe-x9ZQF7o", "Sei tumi keno eto ochena hole | Ayub Bachchu |", "Sei tumi keno eto ochena hole | Ayub Bachchu | LRB | সেই তুমি কেন এতো অচেনা হলে");
		addVideoItem("jBSVYKhpv-k", "আম্মাজান আম্মাজান | Manna & Shabnam | ", "Ammajan | আম্মাজান আম্মাজান | Manna & Shabnam | Ayub Bacchu | Ammajan");
		addVideoItem("U5TDBu_hsbQ", "Cholo Bodle Jai | চলো বদলে যাই |AYUB BACHCU", "Cholo Bodle Jai | চলো বদলে যাই | LRB | Ayub Bachchu | সুখ | AB Kitchen");
		addVideoItem("KwrSIbjFdC4", "Meye - মেয়ে - Ayub Bachchu", "Meye - মেয়ে - Ayub Bachchu - Lyrics - Lofi");
		addVideoItem("GdpVizubcSI", "Maa | মা | Ayub Bachchu", "Maa | মা | By Legend Ayub Bachchu | Bangla Songs | Rtv Music Special");
		addVideoItem("lauTIvMtyxQ", "Jeona Chole Bondhu Amay Aka Rekha | Ayub Bachchu ", "যেও না চলে বন্ধু আমায় একা রেখে | Jeona Chole Bondhu Amay Aka Rekha | Ayub Bachchu | Lrb Song");
		addVideoItem("zrCmsF50kEw", "Baro Mash - বার মাস | Ayub Bachchu ", "Baro Mash - বার মাস | Ayub Bachchu | LRB | Ami baro mash tomay valobashi | Lyrics Video");
		addVideoItem("qiOoiNi5hXs", "Nodir Buke Chad | Ayub Bachchu | ", "Nodir Buke Chad | Ayub Bachchu | নদীর বুকে চাঁদ | আইয়ুব বাচ্চু | Music Video");
		addVideoItem("5BUmMWUNEm4", "Rupali Guitar - Ayub Bachchu", "Rupali Guitar - Ayub Bachchu, রুপালি গিটার - আইয়ুব বাচ্ছু");
		addVideoItem("LIFS41jkHIA", "Tin Purush | তিন পুরুষ | Ayub Bachchu", "Tin Purush | তিন পুরুষ | Ayub Bachchu | পিয়ানো | AB Kitchen");
		addVideoItem("2uodRd23pOA", "Tomar Karone |AYUB BACHCU", "তোমার কারনে | Lyrics | Tomar Karone | আইয়ুব বাচ্চু | Ayub Bachchu I LRB | Bangla Song | ");
		addVideoItem("KEQHUR8PKJY", "NIROBE | নীরবে |AYUB BACHCU", "NIROBE | নীরবে | LRB | Official Music Video | AB Kitchen");
		//addVideoItem("", "", "");

		createPlayList("আয়ুব বাচ্চু          গান ", R.drawable.bachcu);

		//========================================================================
		//==========================  ONUPOM ROY =================================
		//========================================================================

		//addVideoItem("", "", "");
		addVideoItem("76QOT-1ryKI", "Hridoyer Rong by Anupam Roy  ", "Hridoyer Rong | Ghare And Baire | Jisshu | Koel | Anupam Roy | Lagnajita | Mainak Bhaumik");
		addVideoItem("9XkTZDZtgv0", "আলাদা আলাদা)-by Anupam Roy", "Alada Alada (আলাদা আলাদা) by Anupam Roy |Ardhangini | Jaya,Churni |Kaushik G");
		addVideoItem("vYsfSlEBh5Y", "Amake Amar Moto Thakte Dao ", "Amake Amar Moto Thakte Dao | Autograph | Prosenjit Chatterjee | Anupam Roy | Srijit Mukherji");
		addVideoItem("o5iNbmDbViA", "'Moner Manush' - Anupam Roy", "Moner Manush' - Anupam Roy Feat. Satyaki Banerjee & Babul Supriyo - Coke Studio");
		addVideoItem("qMPqnA8kjT0", "জল ফড়িং 2.0|Anupam Roy", "Jawl Phoring 2.0 (জল ফড়িং 2.0) | Prem Tame | Anupam Roy | Soumya, Susmita, Sweta | Anindya");
		addVideoItem("p5GsLbl6kDw", "Tui Ki Kore Dili | Anupam Roy", "Tui Ki Kore Dili | Ghare And Baire | Jisshu | Koel | Anupam Roy | Mainak Bhaumik");
		addVideoItem("fbYxVjLEeaM", "Bariye Dao | Anupam Roy", "Bariye Dao ( বাড়িয়ে দাও ) | Chalo Paltai | Prosenjit | Anupam Roy | Haranath Chakraborty I");
		addVideoItem("8h0NVGJrHSg", "গা ছুঁয়ে বলছি | Anupam Roy ", "Ga Chhunye Bolchhi | গা ছুঁয়ে বলছি | Anupam Roy | Official Video | Latest Bengali Song 2022");
		addVideoItem("IxR-hPBqi3I", "Phiriye Dewar Gaan | Anupam ", "Phiriye Dewar Gaan (ফিরিয়ে দেওয়ার গান) | Hemlock Society | Parambrata | Koel | Anupam | Rupam ");
		addVideoItem("1reZByeUhPY", "Baundule Ghuri (বাউন্ডুলে ঘুড়ি) - AnupamRoy", "Baundule Ghuri (বাউন্ডুলে ঘুড়ি) - Reprise By AnupamRoy | New Bengali Song | SVF Music");
		addVideoItem("zPCwgp-S_h0", "Abar Phire Ele | Anupam Roy ", "Abar Phire Ele (আবার ফিরে এলে) | Dwitiyo Purush | Arijit Singh | Anupam Roy | Srijit Mukherji |");
		//addVideoItem("", "", "");
		addVideoItem("wNJKSaP8Xk8", "Tomay Niyei Golpo Hok | Anupam Roy ", "Tomay Niyei Golpo Hok | Highway | Koel Mallick | Parambrata Chatterjee | Anupam Roy | Prashmita Paul");

		addVideoItem("XYr52nEEHck", "Anupam Roy Song Bangladesher Meye ", "Anupam Roy Song Bangladesher Meye | New Music Video | New Bangla Song");
		addVideoItem("FoM3P8T6pso", "Lokkhiti by Anupam Roy ", "Lokkhiti by Anupam Roy | Drishtikone | Prosenjit | Rituparna | Kaushik Ganguly | Churni Ganguly");
		addVideoItem("UYs2uSE20B8", "Class Room |Anupam Roy", "Class Room ( ক্লাস রুম ) | Chalo Paltai | Prosenjit | Anupam Roy | Haranath Chakraborty I");
		addVideoItem("IL_DUuIIcGo", "Tistaan ( তিস্তান ) | Anupam Roy ", "Tistaan ( তিস্তান ) | Anupam Roy | Durbine Chokh Rakhbona | Bengali Album");
		createPlayList("অনুপম রায়      গান ", R.drawable.onupom_roy);



		//==========================================================================
		//===================== HABIB WAHID ========================================
		//==========================================================================

		addVideoItem("S5gcMwh8ayI", "Bhalobasbo Basbo Re | Habib", "Bhalobasbo Basbo Re | ভালোবাসবো বাসবো রে বন্ধু | Riaz & Purnima | Hridoyer Kotha");
		addVideoItem("aMffcZc1vC4", "Beporowa Mon ( বেপরোয়া মন ) | Habib Wahid ", "Beporowa Mon ( বেপরোয়া মন ) | Habib Wahid | Tanjin Tisha | Anonno Mamun Team | FULL HD SONG");
		addVideoItem("0OrRQ0PA5F4", "Habib Wahid New Song", "Habib Wahid New Song 2016 - Official || Moner Thikana || Full Track");
		addVideoItem("O24WY4oJCQg", "Ami Tomar Moner Vitor | Habib Wahid ", "Ami Tomar Moner Vitor | Habib Wahid | Nancy | আমি তোমার মনের ভিতর |");
		addVideoItem("VfxiCzdL6dY", "তোমারে দেখিলো | Habib |", "Tomare Dekhilo | তোমারে দেখিলো | Habib | Nancy | Riaz | Sohana Saba | Movie Song\n");
		addVideoItem("O_xFSe4fZuA", "Prithibir Joto Sukh | পৃথিবীর যত সুখ | Habib Wahid", "Prithibir Joto Sukh | পৃথিবীর যত সুখ | Habib Wahid | Nancy | Akash Choa Bhalobasha | Bangla New Song");
		addVideoItem("JSNviQklxwI", "Doob || ডুব || Habib Wahid ||", "Doob || ডুব || Habib Wahid || Jahid Akbar || Projapoti || New Bangla Song || Official Lyrical Video");
		addVideoItem("LtnTx_kDALU", "Habib Wahid - Nodi", "Habib Wahid - Nodi - Official Music Video");
		addVideoItem("zHNeH6bmZcU", "যে ছিল আড়ালে | Habib |", "Je Chilo Arale | যে ছিল আড়ালে | Habib | Nancy | Shajal | Mehazabien | Eid Special Music Video");
		addVideoItem("c8-4xlGHA-Q", "Shopner Cheyeo Modhur By Habib wahid", "Shopner Cheyeo Modhur By Habib wahid | Music Video | Monalisa");
		addVideoItem("AzEYUHWCHGs", "Dhire Dhire | ধীরে ধীরে | Habib |", "Dhire Dhire | ধীরে ধীরে | Habib | Nancy | Tumi Shandhar O Megho Mala | Bangla Song");
		addVideoItem("OqP-Y2ehh4A", "Mitthe noy | Habib Wahid |", "Mitthe noy | Habib Wahid | Lyrical Video | Bangla song 2017");
		addVideoItem("Z3qHAAjTJH4", "Jadu By Habib Wahid | ", "Jadu By Habib Wahid | Bangla Music Video | Laser Vision");
		addVideoItem("MuJSo1BAQRU", "Mon Munia By Habib Wahid ", "Mon Munia By Habib Wahid | HD Music Video | Saki Ahmed");
		addVideoItem("odPWu-1JUAM", "Abar Tui | Habib Wahid ", "Abar Tui | Habib Wahid | Ayesha Marzana | Angshu | Romantic Song | New Bangla Song");
		addVideoItem("EvRvZoisEW4", "Dohon - Habib Wahid", "Dohon - Habib Wahid ft Dola | Suhrid Sufian (Official Audio)");
		addVideoItem("R-jwLArO7UQ", "Projapoti By Habib Wahid ", "Projapoti By Habib Wahid | HD Music Video | Laser Vision");
		addVideoItem("-qaRJIP0U2I", "Cholo Na | Habib Wahid |", "Cholo Na | Habib Wahid | Fuad | Angshu | Asif Iqbal | Sharlina | New bangla Song");
		addVideoItem("_BUxM1yiZ60", "Obujhpona - Habib Wahid", "Best of Songs/ Obujhpona - Habib Wahid");
		addVideoItem("ccOhCVeeOrU", "Habib Wahid - Abar Konodin", "Habib Wahid - Abar Konodin - Official Music Video");
		createPlayList("হাবিব ওয়াহিদ         গান", R.drawable.habib);

		//======================================================================
		//====================== IMRAN MAHMUDUL SONGS ==========================
		//======================================================================

		//addVideoItem("", "", "");
		addVideoItem("b7sHXJYp4Ew", "Pagol | IMRAN | ", "Pagol | IMRAN | Official Music Video | 2017");
		addVideoItem("7izt614wtgI", "BAHUDORE | Imran |", "BAHUDORE | Imran | Brishty | Official Music Video | 2016");
		addVideoItem("zPZ45BnAakk", "Bolbo Toke Aj New Imran Song", "Bolbo Toke Aj New Imran Bangla Music Video");
		addVideoItem("L4EUzLdrJfg", "Janina Janina By Imran |", "Janina Janina By Oyshee & Imran | Hd Music Video | Robiul Islam Jibon");
		addVideoItem("9xQW1TdRn-U", "Dil Dil Dil by Imran", "Dil Dil Dil | Full Video Song | Shakib Khan | Bubly | Imran and Kona | Boss Giri Bangla Movie 2016");
		addVideoItem("TVn-5_1ahIE", "ORE JAN | IMRAN", "ORE JAN | ওরে জান | তোর চোখে দেখি, তোকে চোখে রাখি | IMRAN MAHMUDUL | Trisha | Niha | Music Video");
		addVideoItem("-1ZyxnBa0t0", "Moner Abdar | মনের আবদার | IMRAN |", "Moner Abdar | মনের আবদার | IMRAN | KONA | Niloy Alamgir | Safa Kabir | Wada | Bangla Song 2023");
		addVideoItem("KUXqP3BpdrE", "Sokhi | সখী | Imran Mahmudul | Kona", "Sokhi | সখী | Imran Mahmudul | Kona | Official Music Video | Bangla Song 2023");
		addVideoItem("NCsOq37sWGI", "Ghum Ghum Chokhe | ঘুম ঘুম চোখে | IMRAN MAHMUDUL", "Ghum Ghum Chokhe | ঘুম ঘুম চোখে | IMRAN MAHMUDUL | NEELA | Music Video | New song 2022");
		addVideoItem("WJBViwf9L8Q", "Tomari Achi | তোমারই আছি | ", "Tomari Achi | তোমারই আছি | Official Music Video | IMRAN | Sabila Nur | Labiba | Bangla Song 2022");
		addVideoItem("dVjVeGOFZl8", "Tor Ek Isharay | IMRAN |", "Tor Ek Isharay | IMRAN | Official Music Video | Imran Eid Song 2017");
		addVideoItem("hRd0w1mxl8E", "Ekoi Pothe Cholna Re | Imran Mahmudul |", "Ekoi Pothe Cholna Re | Imran Mahmudul | Sheniz | Bangla Song 2019 | Official Music Video");
		addVideoItem("AqoESKXnchQ", "এ জীবনে যারে চেয়েছি | Imran |", "E Jibone Jare Cheyechi | এ জীবনে যারে চেয়েছি | Imran | Nazifa Tushi | ❤️❤️Lyrical Video");
		addVideoItem("AnP1LMShlEI", " অনেক সাধনার পরে | Imran & Nancy ", "Onek Sadhonar Pore | অনেক সাধনার পরে | Imran & Nancy | Arifin Shuvo & Jolly | Niyoti | Anupam");
		addVideoItem("4MAnbje9ndQ", "Khuda Tujhse (Hindi) || Imran || ", "Khuda Tujhse (Hindi) || Imran || Porshi || junaid Wasl || Hindi New Song || Official Lyrical Video");
		createPlayList("ইমরান মাহমুদ        গান ", R.drawable.imran2);

		//============================================================
		//====================  TAHSAN KHAN ==========================
		//============================================================

		addVideoItem("ihlVzgJgMaE", "সেই তুমি কে? ", "Fresh Premium Tea Presents Tahsan's - Shei Tumi Ke? | সেই তুমি কে? |");
		addVideoItem("uPmV4ONl3kI", "Ami Parbona Tomar Hote l Tahsan", "Ami Parbona Tomar Hote l Tahsan & Konal l Srabanti Chatterjee l");
		addVideoItem("4tpHzAMKJhg", "Momer Deyal| Rumman ft. Tahsan ", "Momer Deyal | Durbeen (Short Film) | Rumman ft. Tahsan | Nadia | Vicky Zahed | Tahsin Rakib");
		addVideoItem("Jh0K4qHXku0", "Keno Ke Jane | Tahsan ", "Keno Ke Jane | Tahsan & Kona | Asif Iqbal | Ishan Mitra | Amit | OST of Nishsash |");
		addVideoItem("NrYuH5bp1xY", "Cholona Harai | Tahsan |", "Cholona Harai | Tahsan | Shawon Gaanwala | Apeiruss ");
		addVideoItem("pK13Kokvj2E", "ছিপ নৌকো | Prince Mahmud feat Tahsan ", "Chip Nouko | ছিপ নৌকো | Prince Mahmud feat Tahsan & Kona ");
		addVideoItem("oNqj3-jrBic", "Tahsan - Bhalobashar Maane", "Tahsan - Bhalobashar Maane (Tai Tomake OST)");
		addVideoItem("24GngnukIFY", "কে তুমি || Tahsan |", "Ke Tumi || কে তুমি || Tahsan | MD. Kanak || Bangla New Music Video || ");
		addVideoItem("C-0vOChcjHo", " আলো | Tahsan |", "Alo | আলো | Tahsan | Album Ecche | Tahsan Art Track | ");
		addVideoItem("8OvE_24SAjw", "তুমি চন্দ্র-সূর্য Tahsan Khan", "New song Tumi Chondro Surjo তুমি চন্দ্র-সূর্য Tahsan Khan Bangla New Song ");
		addVideoItem("V8K2RR21mOU", "Bhalobashi Tai | TAHSAN | ", "Bhalobashi Tai | TAHSAN | PAYEL | Emon Chowdhury | ");
		addVideoItem("HwGzQ_MgVLo", "Tomar Premer Moto | Tahsan |", "Tomar Premer Moto | Tahsan | Sajid Sarker | Bangla Song 2023");
		addVideoItem("kHfGcbonRuM", "আমি সেই সুতো || Tahsan |", "Ami Sei Shuto || আমি সেই সুতো || Tahsan || Uddeshsho Nei || New Bangla Song");

		createPlayList("তাহসান খান           গান ", R.drawable.tahsan3);


		//============================================================
		//===================TANVIR EVAN==============================
		//============================================================

		addVideoItem("HXRKYqdddjM", "ছেড়ে যেওনা (অভিমান) | Tanveer Evan", "ছেড়ে যেওনা (অভিমান) | Tanveer Evan | Piran khan.");
		addVideoItem("-3d1PB3SU3c", "Maine Royaan|Tanveer Evan", "Maine Royaan | Lofi~Remix| Tanveer Evan.");
		addVideoItem("qQhhil2vBJc", "তোমাকে চাই | Tanveer Evan,", "Tomake Chai | তোমাকে চাই | Tanveer Evan, Piran Khan | Jovan, Niha| ");
		addVideoItem("wKgtBC5Lj8w", "Tui Chara (তুই ছাড়া) - Tanveer Evan l", "Tui Chara (তুই ছাড়া) - Tanveer Evan l Lovegen l Piran khan.");
		addVideoItem("Vp6d-4FRn-8", "Tanveer Evan - Heartbreaker", "Tanveer Evan - Heartbreaker| Bangla Song");
		addVideoItem("RLTTxZkc9_w", "Tui Chara - Tanveer Evan", "Tui Chara - Tanveer Evan | Bangla Lofi");
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("zari70_ppQw", "অভিমান | Tanveer Evan | ", "Oviman | অভিমান | Tanveer Evan | Piran Khan | Jovan | Mehazabien |");
		addVideoItem("5KQPD92Vnfs", "Jontrona | Tanveer Evan | ", "Jontrona | Tanveer Evan | Bangla song");
		addVideoItem("Qe6VVQdF-J4", "Shesh Kanna | Tanveer Evan ", "Shesh Kanna | Tanveer Evan | Benazir | Piran Khan");
		addVideoItem("XHztVXIzuEQ", "মন বোঝেনা|Tanvir Evan", "O Mon Re | মন বোঝেনা (Reprise Version)| Tanveer Evan | Piran Khan.");

		createPlayList("তানভীর ইভান         গান ", R.drawable.evan);




		//=================================================================
		//=========================Ashes ==================================
		//=================================================================
		addVideoItem("asFPrC2RudI", "Shey Amare - Ashes ", "Shey Amare - Ashes |Official Bangla Song");
		addVideoItem("KoHlBpNTSrQ", "আমার দিকে তাকিয়ে সে ", "Amar Dike Takiye Shey - আমার দিকে তাকিয়ে সে | Ashes | Official Music Video");
		addVideoItem("HTJuRf5jEyQ", "Tamak pata", "Tamak pata - Ashes ( Official Audio )");
		addVideoItem("PoQFP-sb-uQ", "উড়ে যাওয়া পাখির চোখে", "Urey Jawa Pakhir Chokhe (উড়ে যাওয়া পাখির চোখে) - Ashes | Official Animated Music Video");
		addVideoItem("pbaIh61gWEo", "17 prishtha ( সতেরো পৃষ্ঠা ) by Ashes", "17 prishtha ( সতেরো পৃষ্ঠা ) by Ashes (Official Bangla Song)");
		addVideoItem("4rZwI2doNAs", "Ashes- Kemon Acho", "Ashes- Kemon Acho (Lyrics)");
		addVideoItem("HOFy71OO9aY", "Nijer Jonno ( নিজের জন্য )", "Nijer Jonno ( নিজের জন্য ) - Ashes | Official Music Video");
		addVideoItem("2Vh1D3_NcQM", "Charpoka By Ashes", "Charpoka By Ashes| Bangla Song ");
		addVideoItem("Qf-NByGvppY", "( আমি বদলে যাব ) - Ashes ", "Ami Bodley Jabo ( আমি বদলে যাব ) - Ashes | Official Video");
		addVideoItem("Th1o-lky9BM", "Ayna ( আয়না )- Ashes ", "Ayna ( আয়না ) Official - Ashes ( Lyrical Video )");
		addVideoItem("8QxwiDJKwmQ", "কলকাতা শহরে | Ashes", "Kolkata Shohore - কলকাতা শহরে | Ashes | Official Music Video");
		addVideoItem("J18K5z7rf5U", "Niruddesh ( নিরুদ্দেশ ) - Ashes ", "Niruddesh ( নিরুদ্দেশ ) - Ashes | Beauty Circus | Official Music Video");
		addVideoItem("YzcLOVklJK0", "Bindeshi Tara (Ashes)", "Bindeshi Tara (Ashes) ভিনদেশী তারা New Song Lyrics");
		createPlayList("অ্যাশেজ              গান ", R.drawable.ashes1);





		//=====================================================================
		//======================== PORSI ======================================
		//=====================================================================
		//addVideoItem("", "", "");
		addVideoItem("L1dB_6OvPH4", "ভালোবাসি |PORSI", "Bhalobashi | ভালোবাসি | Belal Khan | Porshi | New Music Video | Laser Vision");
		addVideoItem("0C-WgTG8gZ8", " খুঁজে খুঁজে || Arfin Rumey || Porshi ||", "Khuje Khuje || খুঁজে খুঁজে || Arfin Rumey || Porshi || New Bangla Song 2020 | Official Lyrical Video");
		addVideoItem("4hH7tmvUGV8", "ওরে মন | Porshi |", "Ore Mon | ওরে মন | Porshi | Arfin Rumey | Official Music Video |");
		addVideoItem("fCPhZTEcjOc", "Amar Hoye Thakna | Porshi |", "Amar Hoye Thakna | Porshi | Avraal Sahir | Jovan | Bhalobasar Tin Din Natok Song");
		addVideoItem("nA8G__F6Bik", "Tomari Porosh By Porshi ", "Tomari Porosh By Porshi & Arfin Rumey | HD Music Video");
		addVideoItem("4MAnbje9ndQ", "Khuda Tujhse (Hindi)  Porshi ||", "Khuda Tujhse (Hindi) || Imran || Porshi || junaid Wasl || Hindi New Song || Official Lyrical Video");
		addVideoItem("uHgMWgR0des", "Mon Gole Jai | Porshi |", "Mon Gole Jai | Porshi | Avraal Sahir | Love Station Natok Song | Bangla Song 2023");
		addVideoItem("E8442SLyX_M", "জয় হবেই হবে | Porshi | ", "জয় হবেই হবে | Porshi | Imran | Official Music Video |");
		addVideoItem("qBFyR5SGPV8", "Hawai Hawai | Porshi | ", "Hawai Hawai | Porshi | Avraal Sahir | Niloy Alamgir | Heme | Happiness Natok Song | Bangla Song 2023");
		addVideoItem("HFq84xHVRAg", "Ekta Golpo Shon | Porshi |", "Ekta Golpo Shon | Porshi | Avraal Sahir | Musfiq R. Farhan | Keya Payel | Nasib Natok Song");
		addVideoItem("9uFA_sKuNaU", "যেওনা দূরে |PORSI", "Jeona Dure | যেওনা দূরে | Full Song | Jovan | Porshi | Avraal Sahir | Monjure | New Bangla Song 2023");
		addVideoItem("A7uOfN8Vh9A", "Chol Pakhi Hoye Uri | Porshi |", "Chol Pakhi Hoye Uri | Porshi | Avraal Sahir | Musfiq R Farhan | Keya Payel |");
		addVideoItem("5CBabYMnhX8", "Valobasha Pai Ni |PORSI", "Valobasha Pai Ni | Konal | Avraal Sahir | Porshi | Jovan | Bhalobasar Tin Din Natok Song");
		createPlayList("সাবরিনা পরশি   গান ", R.drawable.porsi2);

		//======================================================================
		//=========================== REDOY KHAN=================================
		//======================================================================
		addVideoItem("BYkNJOkbWSM", "Hridoy Khan - Bhalo Lage Na", "Hridoy Khan - Bhalo Lage Na|Official Bangla Song");
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("apIdSJdfmAU", "Phire To Pabona- Hridoy Khan", "Phire To Pabona- Hridoy Khan Ft Raj Thillaiyampalam | Official Video");
		addVideoItem("ieBQUr425Dc", "আড়াল | Hridoy Khan", "Aral | আড়াল | Hridoy Khan | New Bangla Song | Official Music Video | Chowa |");
		addVideoItem("pkRai2hVyH8", "Hridoy Khan - Chaina Meye", "Hridoy Khan - Chaina Meye | Lyrical Video | Hridoy Mix");
		addVideoItem("V0HTD-230L0", "Hridoy Khan - Abegi Ay Mon ", "Hridoy Khan - Abegi Ay Mon (Official Retro Video)");
		addVideoItem("0dGS7dNwlrU", "Ki Jala | Hridoy Khan", "কি জ্বালা দিয়ে গেলা মোরে | Ki Jala | Hridoy Khan | Bangla Folk Song");
		//addVideoItem("", "", "");
		addVideoItem("6PoQ0RFrVBI", "Vebe Vebe By Hridoy Khan", "Vebe Vebe By Hridoy Khan & Nijhu | Music Video | Ripon Khan | Tani");
		addVideoItem("4k4-jgF5foE", "তুমি এলে || Hridoy Khan ", "Tumi Ele || তুমি এলে || Hridoy Khan || Gunjan Chowdhury || Official Lyrical Video || Bangla New Song");
		addVideoItem("hpYOLteFp_Y", "Hridoy Khan - Bolna Tui Bolna", "Hridoy Khan - Bolna Tui Bolna| Bangla Song");
		addVideoItem("SPCaz5PfIkI", "OBUJH BHALOBASHA - HRIDOY KHAN", "OBUJH BHALOBASHA - HRIDOY KHAN : OMZ WIND OF CHANGE [ S:02 ]");
		createPlayList("হৃদয় খান              গান ", R.drawable.redoy1);

		

		//=======================================================================
		//=======================F.A SUMON ======================================
		//=======================================================================
		addVideoItem("KSctLlMhnak", "জানেরে খোদা জানে | F A Sumon ", "Jane Re Khoda Jane | জানেরে খোদা জানে | F A Sumon | A. Mizan | New Bangla Song |");
		addVideoItem("rzaG_h0c638", " পাগলি রে || F A Sumon ||", "Pagli Re || পাগলি রে || F A Sumon || Shohag Waziulla || Iti Tomar Priyo ||");
		addVideoItem("1HTGhDZE4No", "তোর লাগিরে | F A Sumon | ", "Tor Lagi Re | তোর লাগিরে | F A Sumon | Sohag Waziullah | Nazmus Shadat Nazim |");
		addVideoItem("owLBkk9qULI", "মন মুনিয়া || F A Sumon ", "Mon Munia || মন মুনিয়া || F A Sumon || Arpita || Dorodiya || Bangla New Song ||");
		addVideoItem("c8RvZWF5syE", " রঙ্গিলা রে || F A Sumon ||", "Rongila Re | রঙ্গিলা রে || F A Sumon || Nodi | Torikul Islam | Bangla New Song ");
		addVideoItem("3xKJmvBZvRA", "Jaadu Re | F A Sumon ", "জাদু রে | Jaadu Re | F A Sumon | এ কেমন ভালোবাসা | Bangla Hit Song 2022 ");
		addVideoItem("iCCrfwvwZcQ", "জানরে তুই |F.A SUMON ", "Jaan Re Tui - Reprised | জানরে তুই | Keshab Dey | F A Sumon | Bangla Sad Song 2022");
		addVideoItem("Os6gEJLszVw", " ডানা ভাঙ্গা পাখি। F A Sumon |", "Dana vanga pakhi ( ডানা ভাঙ্গা পাখি)। F A Sumon | Bangla New Song 2021 |");
		addVideoItem("kJ5KBJbh8WI", "জ্বালা | F A Sumon | ", "Jala |জ্বালা | F A Sumon | Best Of FA Sumon Hits| Latest Bangla Romantic Song 2021|");
		addVideoItem("XftWAa4VaI4", "বধুয়া || F A Sumon ||", "Bodhua || বধুয়া || F A Sumon || Bangla New Song || Official Music Video ||");
		//addVideoItem("", "", "");
		addVideoItem("oa5h-3en-7U", "Shuk Pakhi By F A sumon", "Shuk Pakhi By F A sumon bangla 2018 song NiDhi Nupor moni");
		addVideoItem("6tWkWjMjan8", "সইরে | F A Sumon |", "Soi Re | সইরে | F A Sumon | Real Ashique | Shohag Waziulla | Official Lyrical Video ");
		addVideoItem("TZTeF59gUug", " দুই দুয়ারী মন | F A Sumon ।", "Dui Duari Mon | দুই দুয়ারী মন | F A Sumon । Snigdha । Official Music Video 2023");
		addVideoItem("lCLLOYrUqo0", "F A Sumon | অচিন পাখি |", "Achin Pakhi | F A Sumon | অচিন পাখি | Tanveer Porosh | Eid Special | Bangla New Sad Song 2022");
		addVideoItem("rxB05X9_MUI", "পিঞ্জর | F A Sumon |", "Pinjor | পিঞ্জর | F A Sumon | Bangla New Song | Official Lyrical Video");
		addVideoItem("3lTR7hl6Ju0", "Mon Boro Beiman | F A Sumon |", "Mon Boro Beiman | F A Sumon | Album: Iti Tomar Priyo | Bangla Lyrical Video");
		createPlayList("এফ.এ সুমন         গান ", R.drawable.sumon);


		//======================================================================
		//========================= PRITOM HASAN ===============================
		//======================================================================

		addVideoItem("O8yq399dsyk", "Deora | Pritom Hasan", "Deora | Coke Studio Bangla | Season 2 | Pritom Hasan X Fazlu Majhi X Palakar X Ghaashphoring Choir");
		addVideoItem("b5StpJFUlNU", "Beainshab | Pritom ft.Protic ", "Beainshab | Pritom ft.Protic & Naumi | Angshu | Wedding Song Of The Year | New Bangla Song");
		addVideoItem("UofiHkALL1w", "Girlfriend Er Biya|Pritom Hasan", "Girlfriend Er Biya|Pritom Hasan|Bangla New Song");
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("bM7_TctP3KQ", "PATAKA Pritom Hasan |", "PATAKA (Official Music Video) | Nusraat Faria | Pritom Hasan |");
		addVideoItem("4dh63y9Q8-M", " রাজকুমার | Pritom Hasan |", "Rajkumar | রাজকুমার | Pritom Hasan | Sunerah | Angshu | Bangla new song 2018");
		addVideoItem("sqQ9Ot0UyPs", "Shoroter Shesh Thekey ", "Shoroter Shesh Thekey (Official Music Video) | Pritom Hasan | Israt Sabrin | Bangla New Song 2022");
		addVideoItem("TM84hCKY3bs", "Boyosh Amar Beshi Na |Pritom Hasan |", "Boyosh Amar Beshi Na | Remix | Pritom Hasan | Gurupada Gupta | Lyrical Video | New Bangla Song");
		addVideoItem("W531lAjrwtA", "Ami Amar Moto ", "Ami Amar Moto - Official Solo Version | Pizza Bhai OST | Pritom | Shuvro | Bangla New Song 2019");
		addVideoItem("XDhx1CLqzWs", "Durotto | Pritom Hasan |", "Durotto | Pritom Hasan | Lyrical Video | Bangla New Song | 2017");

		createPlayList("প্রীতম হাসান        গান ", R.drawable.pritom1);

		//==========================================================================
		//============================= SAMZ VAI====================================
		//==========================================================================

		addVideoItem("ZTdYu7rTTe0", "Tumi Purnimari Alo | Samz Vai |", "Tumi Purnimari Alo | Samz Vai | Bangla Song 2019 | Official MV | Bangladeshi Song | Eagle Music");
		addVideoItem("OyWvaMfUVZs", "Ghum Valobashi | Samz Vai |", "Ghum Valobashi | Samz Vai | Bangla Song 2019 | Official MV | EID 2019");
		addVideoItem("F8-wm7ARQOk", "Tui Boro Beiman Re Bondhu | Samz Vai | ", "Tui Boro Beiman Re Bondhu | Samz Vai | Bangla Song 2020 | Official MV | নতুন গান");
		addVideoItem("c7oz6QBHkFc", "তোরে ভুলে যাওয়ার লাগি | Samz Vai ", "Tore Vule Jawar Lagi | তোরে ভুলে যাওয়ার লাগি | Samz Vai | Bangla Song 2019 | Official Video");
		addVideoItem("BpK2At9CkRw", "Kande Mon Amar ", "Kande Mon Amar | Bangla Song 2019 | Samz Vai, Afran Nisho, Sabila Nur | Cheka Kheye Beka Natok Song");
		addVideoItem("mGQtJsuifKM", "আমার সোনার ময়না পাখি ", "আমার সোনার ময়না পাখি । Amar Sonar Moyna Pakhi। । Samz vai | Bangla New Song 2021 | Official Video");
		addVideoItem("pRLKHtySIUs", "Khachar Pakhi | Samz Vai | ", "Khachar Pakhi | Samz Vai | Salha khanam Nadia | Rakib Fuhat | Official Music Video | Bangla new song");
		addVideoItem("Pjsu7QCIOsY", "Jaiba Tumi | Song 2019 | Samz Vai |", "Jaiba Tumi | Song 2019 | Samz Vai | Official Video | যাইবা তুমি | Bangla Song 2019");
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("iNDQpWxQvO0", "ভেতরটা জ্বালায় গেলা | Samz Vai ", "Vetorta Jalay Gela | ভেতরটা জ্বালায় গেলা | Samz Vai | Bangla Song 2020 | Official Video");
		addVideoItem("piFDMTQqW2o", "বন্ধু তোরে ভালোবাসি | Samz Vai", "Bondhu Tore Valobashi | বন্ধু তোরে ভালোবাসি | Samz Vai | MR Rizan | Sonia | Bappy | Disha | New Song");
		addVideoItem("V96lMSHh4Ds", "মরণ আমি চাই | Samz Vai", "Moron Ami Chai | মরণ আমি চাই | Samz Vai | Antu Karim | Shakila Parvin | Music Video 2021");
		addVideoItem("9cOIFViu29w", "Amar Moner Majhe Tui Chara Keu Nai ", "Amar Moner Majhe Tui Chara Keu Nai | Samz Vai, Afran Nisho, Mehazabien | Bangla Song 2019 |");
		addVideoItem("pHTxT0DJ4L0", "আমিতো ভালো নেই | Samz Vai", "Ami To Valo Nei | আমিতো ভালো নেই | Samz Vai | Bangla Song 2019 | Official Video | ");
		addVideoItem("hia4ok6wbxs", " তুই বিহনে | Samz Vai ", "Tui Bihone | তুই বিহনে | Samz Vai | Bangla Song 2019 | Official MV | Eagle Music | বাংলা গান");
		addVideoItem("RNoEX6CwUBI", "লেনাদেনা | Samz Vai ", "Lenadena | লেনাদেনা | Samz Vai | Bangla Song 2019 | Official Video");
		addVideoItem("d3RF78zPveA", "ও বন্ধু রে | Samz Vai |", "O Bondhu Re | ও বন্ধু রে | Samz Vai | Bangla Song 2020 | Official Music Video ");
		addVideoItem("kcqUSif7nRc", "Amar | Samz Vai |", "Amar | Samz Vai | Bangla Song 2019 | Love Challenge | Afjal Sujon, Ontora | MV");
		addVideoItem("f7dx0DXia8M", "পুরুষ টাকার মেশিন | Samz Vai |", "Purush Takar Machine | পুরুষ টাকার মেশিন | Samz Vai | Miss Chocolate | Rafi | Official Music Video");
		addVideoItem("7J53DIo-TWY", "মন ভাঙ্গা এক মানুষ আমি | Samz Vai | ", "মন ভাঙ্গা এক মানুষ আমি | Samz Vai | Mon Vanga Ek Manush Ami | Bangla Song 2023 | Tiktok Viral Song");
		addVideoItem("ssGIidhsiWc", "Tomay Mone Porena | Samz Vai |", "Tomay Mone Porena | Samz Vai | Opu Vai | Neha Akter | Aanfi Sinha | Official Music Video");
		createPlayList("শামজ ভাই           গান ", R.drawable.samz1);



		//=====================================================================
		//======================== KAZI SHUVO ==============================
		//=====================================================================
		//addVideoItem("", "", "");
		//addVideoItem("", "", "");
		addVideoItem("a3RQ0WRdtyQ", "Nai Kichu Ar | Kazi Shuvo | ", "Nai Kichu Ar | Kazi Shuvo | HD Music Video |");
		addVideoItem("0zUfsGyHQms", "Kazi Shuvo - Radha | ", "Kazi Shuvo - Radha | HD Music Video | Radharaman Dutta | Arfin Rumey | Khan Mahi");
		addVideoItem("m90FTLdpKi4", "( নাম্বার ১ প্রেমিক ) | Kazi Shuvo |", "NUMBER 1 PREMIK ( নাম্বার ১ প্রেমিক ) | Kazi Shuvo | Akassh Sen | Asif ");
		addVideoItem("4uM9BTDjqcI", "Sona Bou By Kazi Shuvo |", "Sona Bou By Kazi Shuvo | HD Music Video | Laser Vision");
		addVideoItem("sCKFkMhNQgs", "Mon Pajore | Kazi Shuvo | ", "Mon Pajore | Kazi Shuvo | Rakib Musabbir | HD Music Video |");
		addVideoItem("c3M7ZZC_lAU", "Moner Akashe By Kazi Shuvo |", "Moner Akashe By Kazi Shuvo | Musical film | Robiul Islam Jibon | Rakib Musabbir");
		addVideoItem("KCoqRHhBB7o", "বেঈমান বন্ধু | Kazi Shuvo |", "Beiman Bondhu | বেঈমান বন্ধু | Kazi Shuvo | Sheikh Sakib | Nusrat Papiya | Bangla New Song 2021");
		addVideoItem("8F_Wvra28Xc", "মাটির ময়না | Kazi Shuvo | ", "Matir Moyna | মাটির ময়না | Kazi Shuvo | Latest Music Video 2023 | ");
		addVideoItem("AIAPAVDbeN0", "Mone Tomay Chay by Kazi Shuvo", "Mone Tomay Chay by Kazi Shuvo-Official Music Video || Bicchedi Palash || New Bangla song 2023");
		addVideoItem("SB0hWQrFC_w", "মাটির দেহ | Kazi Shuvo |", "Matir Deho | মাটির দেহ | Kazi Shuvo | Maisha Farzana | Porichoy | Real Ashique, Official Music Video");
		addVideoItem("iWOIPYVPFcg", "Apon Manush | Kazi Shuvo |", "আপন মানুষ | Apon Manush | Kazi Shuvo | Pritom khan | Dolon Ahmed | New Bangla Music Video 2022");

		createPlayList("কাজী শুভ    	   	গান ", R.drawable.kazi);



		//=========================================================================
		//===========================S.I TUTUL ====================================
		//==========================================================================
		addVideoItem("FXzkZxiscgM", "নিঃশ্বাস আমার তুমি |", "Nishash Amar Tumi | নিঃশ্বাস আমার তুমি | Shakib Khan & Sahara | S. I. Tutul | Priya Amar Priya");
		addVideoItem("-YjJRWFjS4o", " যায় দিন যায় একাকী ", "Jay Din Jay Ekaki | যায় দিন যায় একাকী | HD | Riaz & Purnima | S. I. Tutul | Hridoyer Kotha | Anupam");
		addVideoItem("qVakmrWr94c", "দেখলে তোরে মনটা বলে ", "Dekhle Tore Monta | দেখলে তোরে মনটা বলে | HD | Shakib Khan & Apu Biswas | Daring Lover |");
		//addVideoItem("", "", "");
		addVideoItem("n0d1KoBwCWk", " ও প্রেমী ও প্রেমী", "O Premi | ও প্রেমী ও প্রেমী | HD | Shakib Khan & Apu Biswas | S.I. Tutul & Doly | Moner Jala |Anupam");
		addVideoItem("FI-dmXy-EiU", "Dhurbotara ", "Dhurbotara | S.I Tutul | Face To Face | Bangla New Song | Official lyrical Video ");
		addVideoItem("WuBNgXsaKKk", "আমার আশা নেই ", "Amar Asha Nei | আমার আশা নেই | HD | Shakib Khan & Apu Biswas | S. I. Tutul | O Sathire | ");
		//addVideoItem("", "", "");
		addVideoItem("v9eF3OiEYZ8", "আসতেই হবে আজ তোমাকে", "Astei Hobe Aj Tomake | আসতেই হবে আজ তোমাকে | HD | Shakib Khan & Apu Biswas | Takar Cheye Prem Boro");
		addVideoItem("WuBNgXsaKKk", "আমার আশা নেই", "Amar Asha Nei | আমার আশা নেই | HD | Shakib Khan & Apu Biswas | S. I. Tutul | O Sathire | Anupam");
		addVideoItem("53orXmZdEaA", "তুমি পৃথিবী আমার ", "Tumi Prithibi Amar | তুমি পৃথিবী আমার | HD | Shakib Khan & Apu Biswas | S. I. Tutul | Bolona Kobul");
		createPlayList("এস.আই.টুটুল        গান ", R.drawable.tutul1);






		//=========================================================================
		//=========================== ARMAN ALIF ====================================
		//==========================================================================

		addVideoItem("DB3YrZIObyQ", "Beiman | Arman Alif |", "Beiman | Arman Alif | Sahriar Rafat | Official Music Video | Bangla Song 2018");
		addVideoItem("qbN7DtPAKQo", "Oporadhi |Arman Alif ", "Oporadhi | Ankur Mahamud Feat Arman Alif | Bangla Song 2018 | Official Video");
		//addVideoItem("", "", "");
		// addVideoItem("", "", "");
		addVideoItem("vCf_EZ73Cbg", "Dushopno | Arman Alif |", "Dushopno | Arman Alif | Sahriar Rafat | Official Music Video | New Song 2018");
		addVideoItem("n7rMFfpdEP0", "Vul | ভুল | Arman Alif ", "Vul | ভুল | Arman Alif | Subah | Full HD | New Bangla Song 2021");
		addVideoItem("cZMcBlTPKTs", "বেঈমান ২ | Arman Alif", "Beiman 2 | বেঈমান ২ | Arman Alif | Official Music Video | Ovi | Adiva | New Bangla Song 2023");
		addVideoItem("fn2tlVverj8", "যেই তুমিতে আমি নাই", "Jei Tumite Ami Nai | যেই তুমিতে আমি নাই | Official Music Video | Arman Alif | Saniya | ");
		addVideoItem("hNTEHHqqVTE", "পুরান বাড়ি | Arman Alif", "Puran Bari | পুরান বাড়ি | Arman Alif | New MUSICAL Film | Naz Multimedia BD |");
		addVideoItem("7OycwyrZ6Hc", "Khub Sohoj | Arman Alif |", "Khub Sohoj | Arman Alif | Sahriar Rafat | Official Music Video | New Song 2018");
		addVideoItem("7Cty2I8rUfk", "Vabte Pari Na | Arman Alif |", "ভাবতে পারি না | Vabte Pari Na | Arman Alif | New Year Song | 2024 |");
		createPlayList("আরমান আলিফ    গান ", R.drawable.arman);






	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

