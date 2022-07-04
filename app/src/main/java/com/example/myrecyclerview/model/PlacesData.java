package com.example.myrecyclerview.model;

import com.example.myrecyclerview.R;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placesName = {
            "Tunjungan Plaza",
            "Pakuwon Mall",
            "Ciputra World",
            "Kenjeran Beach",
            "Bungkul Park",
            "Surabaya Zoo",
            "Surabaya Carnival",
            "Galaxy Mall",
            "House of Sampoerna",
            "Suramadu Bridge"
    };

    private static String[] placesDetail = {
            "Tunjungan Plaza merupakan pusat perbelanjaan terbesar kedua di Surabaya setelah Pakuwon Mall. Ini memiliki area sewa bersih seluas 160.000 m², yang menampung lebih dari 500 gerai ritel termasuk butik, restoran, kafe, bioskop, toko buku, supermarket, dan pusat arcade anak-anak. ",
            "Pakuwon Mall (sebelumnya Supermal Pakuwon Indah, disingkat SPI) adalah mall terbesar di Surabaya, Indonesia. Mal ini memiliki area yang dapat disewakan seluas 180.000 m2. Mal ini terhubung dengan Pakuwon Trade Center (PTC). Berada di Jalan Puncak Indah Lontar di kompleks Pakuwon Indah Superblock di atas lahan seluas 30 hektar, di CBD Surabaya Barat. Di bagian atas Pakuwon Mall terdapat empat tower apartemen yaitu Orchard and Tanglin Tower, Anderson dan Benson Tower yang saat ini masih dalam tahap pembangunan, serta terdapat dua tower kondominium bernama La Riz dan La Viz. La Viz masih dalam pembangunan. ",
            "Ciputra World Surabaya adalah kompleks pengembangan campuran di Surabaya, Indonesia. Superblok yang dikembangkan oleh PT. Ciputra Development Tbk., yang memiliki luas lahan sekitar 9 hektar. Superblok ini memiliki 4 tower residensial bernama The Via, The Vue, The Viola, dan Sky Loft. Menara perumahan lainnya, Vie Loft, dan menara perkantoran sedang dalam pembangunan.",
            "Pantai Kenjeran terletak di Kecamatan Kenjeran di timur atas Surabaya yang berjarak ± 9 km dari Surabaya. Pantai Kenjeran terbagi menjadi dua pantai; yaitu Pantai Kenjeran Lama dan Pantai Kenjeran Baru.",
            "Taman Bungkul merupakan salah satu kawasan hijau terbuka dan artefak budaya andalan. Keberadaan Taman Bungkul yang dikelilingi pepohonan dan rerumputan hijau membawa manfaat besar untuk mengurangi polusi udara dan juga sebagai lingkungan sosial di sekitarnya.",
            "Kebun Binatang Surabaya didirikan berdasarkan Surat Keputusan Gubernur Jenderal Hindia Belanda pada tanggal 31 Agustus 1916 sebagai Soerabaiasche Planten-en Dierentuin atas jasa wartawan H. F. K. Kommer yang memiliki hobi mengoleksi satwa.",
            "Suroboyo Carnival merupakan destinasi wisata yang memiliki wahana rekreasi yang begitu lengkap dan dapat dimainkan oleh semua umur. Suroboyo Carnival memiliki berbagai keunikan diantaranya yaitu buka pada malam hari dan merupakan tempat wisata terbesar di Kota Surabaya",
            "Galaxy Mall (sebelumnya bernama Mal Galaxy) dibangun pada tahun 1994. Dua tahun kemudian, pembangunannya selesai dan dibuka. Saat itu pusat perbelanjaan tersebut dikelola oleh PT. Sinar Galaksi. Tenant utama saat itu adalah Hero Supermarket, Timezone, Keris Department Store, McDonald's dan Galaxy 21. Galaxy Mall juga memiliki Techno Zone (pusat komputer dan handphone) hingga saat ini, di lantai 2, food court nusantara dan internasional ( sekarang Food Galaxy) di lantai 3.",
            "House of Sampoerna adalah museum tembakau dan kantor pusat Sampoerna yang terletak di Surabaya. Gaya arsitektur bangunan utama yang dipengaruhi oleh kompleks bergaya kolonial Belanda ini dibangun pada tahun 1862, dan sekarang menjadi situs sejarah yang dilestarikan. Sebelumnya digunakan sebagai panti asuhan yang dikelola oleh Belanda‚ dibeli pada tahun 1932, oleh Liem Seeng Tee‚ pendiri Sampoerna dengan maksud untuk digunakan sebagai fasilitas produksi rokok besar pertama Sampoerna.",
            "Jembatan Suramadu juga dikenal sebagai Jembatan Surabaya–Madura, adalah jembatan kabel antara Surabaya di pulau Jawa dan kota Bangkalan di pulau Madura di Indonesia.[4] Dibuka pada Juni 2009,[5] jembatan sepanjang 5,4 km ini merupakan yang terpanjang di Indonesia dan jembatan pertama yang melintasi Selat Madura."
    };

    private static int[] placesPhoto = {
            R.drawable.tunjungan_plaza,
            R.drawable.pakuwon_mall,
            R.drawable.ciputra_world,
            R.drawable.pantai_kenjeran,
            R.drawable.taman_bungkul,
            R.drawable.kebun_binatang,
            R.drawable.surabaya_carnival_park,
            R.drawable.galaxy_mall,
            R.drawable.house_of_sampoerna,
            R.drawable.suramadu_bridge
    };

//    public static ArrayList<Place> getListData() {
//        ArrayList<Place> list = new ArrayList<>();
//        for (int i = 0; i < placesName.length; i++) {
//            Place place = new Place();
//            place.setName(placesName[i]);
//            place.setDetail(placesDetail[i]);
//            place.setPhoto(placesPhoto[i]);
//            list.add(place);
//        }
//        return list;
//    }
//
//    public Place getData(int id) {
//        Place place = new Place();
//        place.setName(placesName[id]);
//        place.setDetail(placesDetail[id]);
//        place.setPhoto(placesPhoto[id]);
//        return place;
//    }
}
