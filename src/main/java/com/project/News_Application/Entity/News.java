package com.project.News_Application.Entity;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class News {
  private String status;
  private int totalResults;
  private ArrayList<Articles> results;
  private String nextPage;
}

// THIS IS THE JSON FORMAT OF THE RESULT OF NEWS GOT FORM "NEWDATA.IO"
// {"status":"success","totalResults":383394,"results":[{"article_id":"53123750d49ec2ba20742fac93d8fd43","title":"삼성전기,
// 성균관대 소재부품융합공학과 사내대학서 졸업생 첫
// 배출","link":"https://www.etoday.co.kr/news/view/2447412","keywords":["전기/전자"],"creator":["이수진","이수진
// (abc123@etoday.co.kr)"],"video_url":null,"description":"삼성전기가
// 소재·부품 분야의 기술 인재 양성을 위해 정식 사내대학 과정으로
// 21일 첫 졸업생을 배출했다고 24일 밝혔다. 삼...","content":"ONLY
// AVAILABLE IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://img.etoday.co.kr/crop/200/120/2139875.jpg","source_id":"etoday","source_priority":623226,"source_name":"이투데이","source_url":"https://www.etoday.co.kr","source_icon":"https://i.bytvi.com/domain_icons/etoday.png","language":"korean","country":["south
// korea"],"category":["top"],"ai_tag":"ONLY AVAILABLE IN PROFESSIONAL AND
// CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN PROFESSIONAL AND CORPORATE
// PLANS","sentiment_stats":"ONLY AVAILABLE IN PROFESSIONAL AND CORPORATE
// PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE PLANS","ai_org":"ONLY
// AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"3901d25835d0d4b623dc090e5e1f4e97","title":"Japan's
// Emperor Naruhito's public plea for peace in rare
// address","link":"https://honey.nine.com.au/royals/naruhito-news-japan-emperor-marks-65th-birthday-with-plea-for-peace/779939b4-c09b-46f7-aa85-150aab718ee1","keywords":["royals"],"creator":null,"video_url":null,"description":"Japan's
// Emperor Naruhito, marking his 65th birthday over the weekend, stressed the
// importance of telling the tragedy of World War II to younger generations,
// pledging to contribute to efforts to promote the understanding of history and
// the determination for peace as the world this year observes the 80th
// anniversary of the war's end.\"As the memory of the war fades today, it is
// important that the tragic experiences and history are passed on to the
// generations who do not know the war,\" Naruhito told a news conference in
// pre-recorded comments released on Sunday (overnight in Australia).Those who
// went through the ordeals during and after the war grew have grown older and
// it is difficult for younger generations to hear their firsthand stories,
// Naruhito said.READ MORE: Fresh blow for Meghan as latest move sparks
// backlashREAD MORE: 'Can you give us a break?': Mum's plea over mid-flight
// actNaruhito, accompanied by his wife, Empress Masako, their daughter Princess
// Aiko and some of his younger brother's family, waved from the palace balcony
// at the cheering well-wishers.Later on Sunday, he celebrated his birthday at a
// palace banquet.The war was fought in the name of his grandfather,
// then-Emperor Hirohito.For a daily dose of 9honey, subscribe to our newsletter
// here.Naruhito said he and Masako, who were born after the war, have learned
// from his parents by hearing their stories of wartime experiences and thoughts
// about peace.His father Akihito, who abdicated in 2019, was known for his
// devotion to making amends for the war, and Naruhito said he will follow his
// example.His concern resonates especially with that of many survivors of
// United States atomic bombings of Hiroshima and Nagasaki in August, 1945, who
// are worried about the lack of progress in nuclear disarmament and growing
// support for nuclear deterrence.IN PICTURES: Every stunning celebrity fashion
// moment from the SAG Awards red carpetREAD MORE: Single letter on actress'
// passport reveals insidious reality she facesThe survivors, or hibakusha, have
// said they hope the awarding of the Nobel Peace Prize to their organisation,
// Nihon Hidankyo, for the decades-long nuclear disarmament effort would raise
// awareness of the younger generations.This year, Naruhito and Masako are
// expected to visit Hiroshima and Nagasaki to pay tribute to those killed by
// the United States atomic bombings and Okinawa, the site of one of the
// harshest battles in the war.FOLLOW US ON WHATSAPP HERE: Stay across all the
// latest in celebrity, lifestyle and opinion via our WhatsApp channel. No
// comments, no algorithm and nobody can see your private
// details.","content":"ONLY AVAILABLE IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://imageresizer.static9.net.au/GAlUjOLSDbGwhrdeREEv6IKJ7Cc=/0x123:2717x1651/1200x628/smart/https:%2F%2Fprod.static9.net.au%2Ffs%2Fcc028f15-cae3-461d-aad3-642d6b8b24a2","source_id":"9news_au","source_priority":19202,"source_name":"9news","source_url":"https://www.9news.com.au","source_icon":"https://i.bytvi.com/domain_icons/9news_au.png","language":"english","country":["australia"],"category":["lifestyle"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"5b492f27258950915fb396e6663ca5b5","title":"Yeh
// Rishta Kya Kehlata Hai 24th February 2025 Written Update: Arman is perplexed.
// -
// Justshowbiz","link":"https://news.google.com/rss/articles/CBMirAFBVV95cUxQYjN1cVUzMGJVOHhIVGNmMXptQnBWUW5mQU5PSFRRMklCZ1NBRTZWNTkwTzNBOFA2ajNaMDR3TmdnbG9INnJBUmVJOGhlTW5zeVBUdnI4WXNFbnFzVWlhalJGTi1pY3dXdzJsLWljV19vTUNxV05yY1JsTHlOUGY5ek5mTHIwVWUya0NUM242SlR2VFY0UFpGZ2tRUDN4OERJbmJfLVhKZ3Q4Tkll?oc=5","keywords":null,"creator":null,"video_url":null,"description":"Yeh
// Rishta Kya Kehlata Hai 24th February 2025 Written Update: Arman is perplexed.
// JustshowbizYeh Rishta Kya Kehlata Hai: Armaan struggles as he and Abhira
// start living in a dirty mohalla India ForumsYeh Rishta Kya Kehlata Hai serial
// update: Armaan chooses Shivani over...; RK brings a major shocking twist
// Bollywood LifeYeh Rishta Kya Kehlata Hai On Location: 'Dharamsankat' For
// Armaan- Which Mother Will He Choose? The Times of IndiaYeh Rishta Kya Kehlata
// Hai Written Update, Feb 22: Armaan learns truth about his biological mother;
// know how he reacts PINKVILLA","content":"ONLY AVAILABLE IN PAID
// PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":null,"source_id":"google","source_priority":14,"source_name":"Google
// News","source_url":"https://news.google.com","source_icon":"https://i.bytvi.com/domain_icons/google.png","language":"english","country":["india"],"category":["entertainment"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"28249d7ccb3efebd50d5d23e389cbe91","title":"Best
// travel deals spotted this week: Qantas offers one million discounted seats to
// 60
// destinations","link":"https://travel.nine.com.au/deals/travel-deals-best-packages-flights-accommodation-spotted/fcf4f2d6-9e6f-43f7-a785-41d44b207ff5","keywords":["deals"],"creator":null,"video_url":null,"description":"For
// those yearning for an escape from everyday life, here are the best domestic
// and international travel deals from Australia at the moment to fulfil your
// jet-setting desires.Top flight deals ﻿Flights ﻿are usually the first expense
// when it comes to booking your trip. However, we've scoured the web for some
// of the best deals out there, so you can save a bit of money as you embark on
// your holiday.Qantas has today launched a major seven-day sale, giving
// travellers the chance to book one million discounted Business and Economy
// seats, using their Qantas Points or cash, across 60 destinations around
// Australia.READ MORE: These airlines have the most generous luggage
// allowancesThe Domestic Economy seats start from 5,400 points or $109 one-way,
// with more than 35 routes under $150. Domestic Business seats start from
// 23,500 points or $369 one-way.Sale fares are for travel from 29 April to 26
// June 2025, 22 July to 18 September 2025 and 14 October to 10 December 2025,
// and available until 11.59pm (AEDT) 2 March 2025, unless sold out prior.READ
// MORE: Everything you need to know about a cruise to AntarcticaCheck out some
// more bargain flights from various Australian locations to some of our
// favourite destinations.Return flights to Seoul from $470Return flights to
// Kuala Lumpur from $269Return flights to Bangkok from ﻿$493Return flights to
// Auckland from $300 ﻿Return flights to Singapore ﻿from $307Return flights to
// Denpasar from $241Return flights to Ho Chi Minh City ﻿from $485The best
// Luxury Escape deals﻿Grand Hyatt BaliPrice: Five nights from $2099 per
// roomEstimated value: ﻿Up to $5045, so you'll save 58 per cent!Rating:
// ﻿8.8Enter a state of serenity in this five-star sanctuary, appointed on the
// golden shores of Nusa Dua.This Grand Hyatt Bali luxury deal includes
// unlimited dining and free-flow drinks.The hotel boasts a wide range of
// prestigious facilities for you to enjoy, including five pools, nine
// restaurants and bars, an ocean-themed kids' club and a serene spa.You can
// also curate your culinary journey across a selection of eateries that are
// bound to cure any craving: savour Nampu's fresh sushi and teppanyaki-style
// delights, graze at sourdough woodfire pizza at Salsa Verde or play billiards
// at the lively Lila Cita Sports Bar.Expect tropical tipples to cool off at the
// Poolside Bar and balmy evenings sipping bubbly at Salsa Bar while the sunset
// paints the sky.Intercontinental Koh Samui ResortPrice: Five nights from $1999
// per roomEstimated Value: Up to $4659, you'll save 57 per cent!Rating: ﻿
// ﻿9.4This luxury deal takes you straight to the heart of one of 'White Lotus'
// Season 3's ﻿main filming sites - the Thai island of Koh Samui.Step into this
// immaculate, five-star resort dramatically positioned on jungled hilltops
// overlooking the Gulf of Thailand.With a 22-acre private beachfront and
// countless awards and accolades, this resort is one of Koh Samui's most
// coveted destinations.Dining is accompanied by ocean views at every table,
// whether you're dining in front of the live cooking station at Amber or
// beneath the stars at the Thai-European fusion restaurant, Flames.Look out
// onto one of the world's most breathtaking sunsets at Air Bar, and float into
// bliss with cocktails at the Pool Bar.Diamond Cliff Resort & Spa, PhuketPrice:
// Seven nights from $1599 per roomEstimated Value: ﻿Up to $4479, you'll save 64
// per cent!Rating: ﻿8.7Discover another dreamy Thai escape in 'White Lotus'
// fashion at this five-star retreat, a picturesque cliffside hideaway in
// Phuket.Boasting views of the Andaman Sea and the rolling hills of North
// Patong, this idyllic resort is ideal for soaking up the sun or the local
// culture, sitting moments from the buzzing downtown area and Patong
// Beach.Spend balmy days swimming in one of the resort's ocean-view pools,
// indulge in a day at Diamond Spa, or dine at three restaurants and three bars
// to choose from.The Little Shore Khao Lak ﻿Price: Five nights from $1799 per
// suiteEstimated Value: ﻿Up to $5571, save 68 per cent.Rating: ﻿9.4Tucked away
// on the pristine Nang Thong Beach in Thailand, this recently-opened resort
// features signature Katathani luxury and a collection of contemporary suites,
// each featuring a sparkling private pool.Savour daily feasts at The Kati
// Restaurant, rejuvenating spa treatments at Nalinya Villa Spa and a floating
// afternoon tea hand-delivered to your private pool.Crown Metropol PerthPrice:
// Two nights from $599 per roomEstimated Value: ﻿Up to $1530, save 60 per
// cent!Rating: ﻿8.8If you want something closer to home – and less expensive –
// why not indulge in this luxury Perth travel package?Endless sunny skies,
// pristine beaches and buzzing city streets await with a stay at this hotel, a
// five-star escape minutes away from the CBD.As Australia's leading integrated
// resort and one of the city's most extraordinary hotels, Crown Metropol Perth
// is a destination within a destination.Enjoy access to state-of-the-art resort
// facilities, including palm-fringed pools, a kid-friendly water playground and
// a cocktail bar with poolside service, along with award-winning dining,
// entertainment and boutique shopping, all without leaving the complex.TRYP by
// Wyndham Southport Gold Coast﻿Price: Three nights from $459 per room.Estimated
// Value: ﻿Up to $1936, save 76 per cent.Rating: ﻿8Streamlined and stylish, each
// self-contained apartment offers a private retreat after enjoying the hotel's
// facilities, including a rooftop with an infinity pool and a dedicated
// entertainment space.You can also enjoy onsite Italian dining at Amore
// Ristorante and sip artisanal cocktails made by expert mixologists at its bar
// counterpart. Keep up with your routine at the state-of-the-art fitness centre
// and steam room, or simply take advantage of Southport's scenic walking
// trails.Nine may receive a commission when you buy from links on our site.READ
// NEXT: Crossbody bags designed for avid travellers﻿","content":"ONLY AVAILABLE
// IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://imageresizer.static9.net.au/LOUFbCKFe-PQIfSGGZz6VB86MnM=/0x37:724x445/1200x628/smart/https:%2F%2Fprod.static9.net.au%2Ffs%2F8b6f4506-8502-4d9c-b6cf-2c5e7fe363ed","source_id":"9news_au","source_priority":19202,"source_name":"9news","source_url":"https://www.9news.com.au","source_icon":"https://i.bytvi.com/domain_icons/9news_au.png","language":"english","country":["australia"],"category":["tourism"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"ba15f192c3e910e464de9b9523c3087a","title":"Krungthai
// COMPASS ชี้3ธุรกิจรับอานิสงส์เงินทุนจีน นิคมฯ-ก่อสร้าง-อสังหา
// ดูสดใส","link":"https://www.thairath.co.th/money/economics/thai_economics/2843545","keywords":null,"creator":null,"video_url":null,"description":"ชี้
// 3 ธุรกิจรับส้มหล่นจากเงินลงทุนที่ไหลมาจากจีน คาดช่วง 1-2 ปีนี้
// จะมีความต้องการสร้างโรงงานเพิ่มขึ้นปีละ 8.5 หมื่นล้านบาท-ถึง 1.05
// แสนล้าน","content":"ONLY AVAILABLE IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://static.thairath.co.th/media/CiHZjUdJ5HPNXJ92O0ftUM78E8Th7BrhOJ.jpg","source_id":"thairath","source_priority":44507,"source_name":"Thairath","source_url":"https://www.thairath.co.th","source_icon":"https://i.bytvi.com/domain_icons/thairath.png","language":"thai","country":["thailand"],"category":["business"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"30caf70f0ce4eced580a784ba419b18e","title":"David
// Vélez, dueño de Nubank, dejó de ser el hombre más rico de Colombia:
// poderoso empresario lo
// desbancó","link":"https://www.infobae.com/colombia/2025/02/24/david-velez-dueno-de-nubank-dejo-de-ser-el-hombre-mas-rico-de-colombia-poderoso-empresario-lo-desbanco/","keywords":null,"creator":["Juan
// Escobar Fernández"],"video_url":null,"description":"La fortuna del banquero
// se ubica en USD9.400 millones, y tuvo una reducción debido a las constantes
// fluctuaciones del mercado a nivel internacional","content":"ONLY AVAILABLE IN
// PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://www.infobae.com/resizer/v2/EC7HS43PO5DLTNHETQVVTX56LM.jpg?auth=638862e02da38473a1b85f581d6e3125d575631c035f84bbd0f96f6ac8721ca9&height=1242&smart=true&width=1920","source_id":"infobae","source_priority":1056,"source_name":"Infobae","source_url":"https://www.infobae.com","source_icon":"https://i.bytvi.com/domain_icons/infobae.png","language":"spanish","country":["united
// states of
// america","colombia","mexico","argentina"],"category":["top"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"7000709cea27475b2323848bba5fe101","title":"¡Aunque
// usted no lo crea!: Robert Ripley, el hombre que creó un imperio
// multimillonario coleccionando hechos
// sorprendentes","link":"https://observador.cr/aunque-usted-no-lo-crea-robert-ripley-el-hombre-que-creo-un-imperio-multimillonario-coleccionando-hechos-sorprendentes/","keywords":["bbc","ripley"],"creator":["BBC
// News &#124; Mundo"],"video_url":null,"description":"¿Cuál fue la carta más
// corta jamás enviada? La misiva de un solo carácter que le mandó el
// escritor francés...The post ¡Aunque usted no lo crea!: Robert Ripley, el
// hombre que creó un imperio multimillonario coleccionando hechos
// sorprendentes appeared first on El Observador CR.","content":"ONLY AVAILABLE
// IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://observador.cr/wp-content/uploads/2025/02/bbc-portada-ripley-930x450.png","source_id":"observador_cr","source_priority":1483734,"source_name":"El
// Observador
// Cr","source_url":"https://observador.cr","source_icon":"https://i.bytvi.com/domain_icons/observador_cr.png","language":"spanish","country":["costa
// rica"],"category":["top"],"ai_tag":"ONLY AVAILABLE IN PROFESSIONAL AND
// CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN PROFESSIONAL AND CORPORATE
// PLANS","sentiment_stats":"ONLY AVAILABLE IN PROFESSIONAL AND CORPORATE
// PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE PLANS","ai_org":"ONLY
// AVAILABLE IN CORPORATE
// PLANS","duplicate":true},{"article_id":"fe46a6f259cbfac5af01ffaf28d7b45b","title":"Sweden's
// future queen marks her 13th birthday with rare
// portrait","link":"https://honey.nine.com.au/latest/princess-estelle-of-sweden-13th-birthday-portrait/f1be1519-f4da-44d0-9bd5-0d82061b958b","keywords":["latest"],"creator":null,"video_url":null,"description":"The
// Swedish royal family is celebrating a momentous occasion!The Crown Princess
// Victoria's daughter, Princess Estelle, has marked her 13th birthday with an
// exciting move.In honour of the special occasion, the Swedish royal family has
// unveiled a new and rare portrait that shows the youngster posed in front of a
// stunning bouquet of flowers.R﻿EAD MORE: Jimmy Barnes' announcement after
// returning home from hospitalThe Swedish royal family announced the news on
// its official Instagram page and website, sharing, \"The princess celebrates
// her 13th birthday privately with her family.\"Princess Estelle was
// photographed at the Royal Palace before her birthday by Kate Gabor, the same
// photographer who took the first picture of the Princess as a newborn,\" it
// concluded.The young royal was pictured in Prince Bertil's apartment, wearing
// a knit grey jumper and skirt set with a love heart locket necklace and a
// tennis bracelet.READ MORE: 'Not even exaggerating': Fan baffled by concert
// act﻿It is understood Princess Estelle celebrated her birthday privately
// alongside her family at the Royal Palace.The princess' future royal career
// has long been shrouded in mixed opinions.In 1980, the line of succession was
// rearranged when the Swedish parliament voted to introduce gender-neutral
// succession rights, allowing women to inherit the throne for the first
// time.READ MORE: Home and Away star Lynne McGranger announces she's leaving
// the hit soap﻿The decision meant Crown Prince Carl Philip, who was younger
// than his sisters but still first in line to the throne before the change, was
// demoted to Prince Carl Philip.The royal's elder sister, Victoria, was
// elevated to Crown Princess, with all future firstborn children of the monarch
// able to accede to the throne, regardless of gender.Subsequently, Crown
// Princess Victoria's eldest child, Princess Estelle, will one day become Queen
// of Sweden, a reality King Carl XVI Gustaf took time to come to terms
// with.READ MORE: The one word Sam Wood never uses with his kids, even though
// he's built a career out of it﻿\"During the autumn, on two interview
// occasions, I received questions about the change in the succession order in
// 1980 in favour of the firstborn child – regardless of gender,\" the King's
// statement said in January 2023.\"I then shared my thoughts about Prince Carl
// Philip retroactively losing his position as crown prince in connection with
// the amendment to the constitution,\" he explained.\"It has pained me deeply
// when, in retrospect, I have heard comments that claim that I would not stand
// behind my daughter, Crown Princess Victoria, as Sweden's heir to the
// throne.For a daily dose of 9honey, subscribe to our newsletter here.\"I
// therefore want to make it clear that my interview answers should not be
// interpreted as criticism of the female succession to the throne or of Crown
// Princess Victoria.\"The female succession to the throne is for me a matter of
// course. The Crown Princess is my successor. She is an extraordinary asset to
// me, my family and our country.\"I am proud of her and her tireless work for
// Sweden.\"FOLLOW US ON WHATSAPP HERE: Stay across all the latest in celebrity,
// lifestyle and opinion via our WhatsApp channel. No comments, no algorithm and
// nobody can see your private details.","content":"ONLY AVAILABLE IN PAID
// PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://imageresizer.static9.net.au/lXCDvLY0uF8w5H6kwoWWPUojyx8=/657x525:3107x1902/1200x628/smart/https:%2F%2Fprod.static9.net.au%2Ffs%2F859ac5f5-abe5-48a0-bba9-79b8f9ff1d3d","source_id":"9news_au","source_priority":19202,"source_name":"9news","source_url":"https://www.9news.com.au","source_icon":"https://i.bytvi.com/domain_icons/9news_au.png","language":"english","country":["australia"],"category":["lifestyle"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"bf0df8206232672d59e855e413b53e22","title":"3
// dead, 2 hospitalized after boat capsizes off of Staten Island, NYC officials
// say -
// SILive.com","link":"https://news.google.com/rss/articles/CBMivgFBVV95cUxNTnhMaFU0NDlQdWhoMXFWYnZYcHpNcE1KR29JTTZwYXNSZWF5LUIzd2VBejlVTEdEd0hiLW8zeUkwSjRqVFotdVVYS0xhSGtveW1tbl91amY1dW1YTUJzTHM5b2Rhb1pIc09UbEFoblVDS1c0SzhVMm9sOTJvZUl6SG41RmpWOWZPTkRUTHQ0aGVFdnNUVjViTTNuUVFDVzlCeXpjYTBxQUFkbHhSNk44ZDVidzZDZU00Nnc4bVl30gHSAUFVX3lxTE1TVTdwOS14N0MybEMxQlVKYlJ6S1N5dEJ2UUdkX2lNVHAxdDJqZ0ZkdGVPQjgyZFBZNERZV1A5c3EtZkFLT29tdVNUckVBRUxRbzBFWWJyblJVTzFaLXUyMFdvVk5zNUFHNUhDb21PVmJvNW1lMFAxQmJWdENVeS1MQkJ1N1IzZmZEbGRTdFByQkZRdEdDUHM1RWRXeEJuWkN4NWtwN25GUkZUWmR4Y0M5dlhYY0RaZFREUUR2SUlZVnlVT2tRRWxwc3pULVdiSFZTdw?oc=5","keywords":null,"creator":null,"video_url":null,"description":"3
// dead, 2 hospitalized after boat capsizes off of Staten Island, NYC officials
// say SILive.com3 dead, 2 injured after boat overturns in Ambrose Channel off
// Staten Island, police say ABC7 New YorkNYC boating horror kills 3, injures 2
// as sixth passenger still missing in freezing waters New York Post 3 dead, 2
// critical after boat overturns off Staten Island: officials NBC New York3 dead
// and 2 injured after boat capsizes near New York NBC News","content":"ONLY
// AVAILABLE IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":null,"source_id":"google","source_priority":14,"source_name":"Google
// News","source_url":"https://news.google.com","source_icon":"https://i.bytvi.com/domain_icons/google.png","language":"english","country":["united
// states of america"],"category":["top"],"ai_tag":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN PROFESSIONAL
// AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN PROFESSIONAL AND
// CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false},{"article_id":"eaabba6a7b2665ea8bc69246ca13c8d9","title":"「ホテイの焼き鳥」9種類、ビュッフェで満喫
// 静岡・清水区のドリプラで24日まで(静岡新聞DIGITAL)","link":"https://news.yahoo.co.jp/articles/986a4a697a94f5f5488e277ef7a79e4ac39814cb","keywords":null,"creator":null,"video_url":null,"description":"焼き鳥の缶詰製品で知られるホテイフーズ(静岡市清水区)は24日まで、同区のエスパルスドリームプラザ内にあるビュッフェ「はとばキッチン」などでイベント「ホテイフーズがやってきた」を展開している。同社が","content":"ONLY
// AVAILABLE IN PAID PLANS","pubDate":"2025-02-24
// 00:02:00","pubDateTZ":"UTC","image_url":"https://newsatcl-pctr.c.yimg.jp/t/amd-img/20250224-00000002-at_s-000-1-view.jpg?exp=10800&h=319&pri=l&w=450","source_id":"yahoo_jp","source_priority":3690,"source_name":"Yahoo
// Japan","source_url":"https://news.yahoo.co.jp","source_icon":"https://i.bytvi.com/domain_icons/yahoo_jp.png","language":"japanese","country":["japan"],"category":["domestic"],"ai_tag":"ONLY
// AVAILABLE IN PROFESSIONAL AND CORPORATE PLANS","sentiment":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","sentiment_stats":"ONLY AVAILABLE IN
// PROFESSIONAL AND CORPORATE PLANS","ai_region":"ONLY AVAILABLE IN CORPORATE
// PLANS","ai_org":"ONLY AVAILABLE IN CORPORATE
// PLANS","duplicate":false}],"nextPage":"1740355320667350605"
// }
// SquareX Safe
// File Viewer
// ✕
// //