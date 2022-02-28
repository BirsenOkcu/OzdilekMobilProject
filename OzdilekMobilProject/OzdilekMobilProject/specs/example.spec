Specification Heading
=====================
This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, run
   gauge specs
Search
--------------
* "3" saniye kadar bekle
* Alışveriş "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" butonunu kontrol et
* "2" saniye kadar bekle
* Alışveriş butonuna tıkla
* "2" saniye kadar bekle
* Kategoriler sayfası açılır
* "2" saniye kadar bekle
* Kategoriler "com.ozdilek.ozdilekteyim:id/nav_categories" butonunu kontrol et
* "2" saniye kadar bekle
* Kategori kadın "//*[@text='Kadın']" tıkla
* "2" saniye kadar bekle
* Kadın "//*[@text='Pantolon']" tıkla
* "2" saniye kadar bekle
* Sayfayı "scroll" et
* "2" saniye kadar bekle
* Sayfayı "scroll" et
* "2" saniye kadar bekle
* Rastgele bir "//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']" seç
* "2" saniye kadar bekle
* Product detail kontrol edilir.
* "2" saniye kadar bekle
* Ürün "com.ozdilek.ozdilekteyim:id/imgFav" favorilere eklenir.