package demo.plavatvornica.com.util;

import java.util.ArrayList;

import demo.plavatvornica.com.R;
import demo.plavatvornica.com.model.Accommodation;

/**
 * Created by Tooroop on 27-Feb-16.
 */
public class DataHelper {

    public static ArrayList<Accommodation> getAccommodations(){
        ArrayList<Accommodation> accommodations = new ArrayList<>();

        Accommodation excelsior = new Accommodation();
        excelsior.setTitle("Excelsior");
        excelsior.setFeaturedImage(R.drawable.exc1);
        int[] excelsiorImages = new int[5];
        excelsiorImages[0] = R.drawable.exc1;
        excelsiorImages[1] = R.drawable.exc2;
        excelsiorImages[2] = R.drawable.exc3;
        excelsiorImages[3] = R.drawable.exc4;
        excelsiorImages[4] = R.drawable.exc5;

        excelsior.setImagesResources(excelsiorImages);
        excelsior.setScore(5);
        excelsior.setAddress("Frana Supila 12");
        excelsior.setPostCode("20000 Dubrovnik");
        excelsior.setDescription("S 5 zvjezdica na privatnoj plaži hotel koji ima: spa centar sa širokim spektrom usluga, u blizini je: palača Sponza");

        Accommodation dubrovnikPalace = new Accommodation();
        dubrovnikPalace.setTitle("Dubrovnik Palace");
        dubrovnikPalace.setFeaturedImage(R.drawable.dub1);
        int[] dubrovnikPalaceImages = new int[5];
        dubrovnikPalaceImages[0] = R.drawable.dub1;
        dubrovnikPalaceImages[1] = R.drawable.dub2;
        dubrovnikPalaceImages[2] = R.drawable.dub3;
        dubrovnikPalaceImages[3] = R.drawable.dub4;
        dubrovnikPalaceImages[4] = R.drawable.dub5;

        dubrovnikPalace.setImagesResources(dubrovnikPalaceImages);
        dubrovnikPalace.setScore(5);
        dubrovnikPalace.setAddress("Masarykov Put 20");
        dubrovnikPalace.setPostCode("20000 Dubrovnik");
        dubrovnikPalace.setDescription("Dubrovnik na privatnoj plaži hotel koji ima: 4 restorane, spa centar sa širokim spektrom usluga");

        Accommodation grand = new Accommodation();
        grand.setTitle("Grand Villa Argentina");
        grand.setFeaturedImage(R.drawable.gra1);
        int[] grandImages = new int[5];
        grandImages[0] = R.drawable.gra1;
        grandImages[1] = R.drawable.gra2;
        grandImages[2] = R.drawable.gra3;
        grandImages[3] = R.drawable.gra4;
        grandImages[4] = R.drawable.gra5;

        grand.setImagesResources(grandImages);
        grand.setScore(5);
        grand.setAddress("Frana Supila 14");
        grand.setPostCode("20000 Dubrovnik");
        grand.setDescription("S 5 zvjezdica na privatnoj plaži hotel koji ima: spa centar sa širokim spektrom usluga, u blizini je: palača Sponza");

        Accommodation divota = new Accommodation();
        divota.setTitle("Divota Apartment Hotel");
        divota.setFeaturedImage(R.drawable.div1);
        int[] divotaImages = new int[5];
        divotaImages[0] = R.drawable.div1;
        divotaImages[1] = R.drawable.div2;
        divotaImages[2] = R.drawable.div3;
        divotaImages[3] = R.drawable.div4;
        divotaImages[4] = R.drawable.div5;

        divota.setImagesResources(divotaImages);
        divota.setScore(4);
        divota.setAddress("Plinarska 75");
        divota.setPostCode("21000 Split");
        divota.setDescription("Pansion, s 4 zvjezdice, ima spa centar, a u blizini je: Dioklecijanova palača");

        Accommodation atrium = new Accommodation();
        atrium.setTitle("Atrium Hotel");
        atrium.setFeaturedImage(R.drawable.atr1);
        int[] atriumImages = new int[5];
        atriumImages[0] = R.drawable.atr1;
        atriumImages[1] = R.drawable.atr2;
        atriumImages[2] = R.drawable.atr3;
        atriumImages[3] = R.drawable.atr4;
        atriumImages[4] = R.drawable.atr5;

        atrium.setImagesResources(atriumImages);
        atrium.setScore(5);
        atrium.setAddress("Domovinskog rata 49a");
        atrium.setPostCode("21000 Split");
        atrium.setDescription("Hotel, s luksuznim sadržajima, ima spa centar, a u blizini je: Dioklecijanova palača");

        Accommodation hilton = new Accommodation();
        hilton.setTitle("Hilton London Paddington");
        hilton.setFeaturedImage(R.drawable.hil1);
        int[] hiltonImages = new int[5];
        hiltonImages[0] = R.drawable.hil1;
        hiltonImages[1] = R.drawable.hil2;
        hiltonImages[2] = R.drawable.hil3;
        hiltonImages[3] = R.drawable.hil4;
        hiltonImages[4] = R.drawable.hil5;

        hilton.setImagesResources(hiltonImages);
        hilton.setScore(4);
        hilton.setAddress("146 Praed Street");
        hilton.setPostCode("London");
        hilton.setDescription("Objekt - hotel s 4 zvjezdice: ima restoran te je blizu brojnih zanimljivosti, među kojima je i Selfridges");

        Accommodation radison = new Accommodation();
        radison.setTitle("Radisson Blu Resort Split");
        radison.setFeaturedImage(R.drawable.rad1);
        int[] radisonImages = new int[5];
        radisonImages[0] = R.drawable.rad1;
        radisonImages[1] = R.drawable.rad2;
        radisonImages[2] = R.drawable.rad3;
        radisonImages[3] = R.drawable.rad4;
        radisonImages[4] = R.drawable.rad5;

        radison.setImagesResources(radisonImages);
        radison.setScore(4);
        radison.setAddress("Put Trstenika 19");
        radison.setPostCode("21000 Split");
        radison.setDescription("S 4 zvjezdice na plaži hotel koji ima: spa centar sa širokim spektrom usluga, u blizini je: Dioklecijanova palača");

        Accommodation hampton = new Accommodation();
        hampton.setTitle("Hampton by Hilton London Waterloo");
        hampton.setFeaturedImage(R.drawable.ham1);
        int[] hamptonImages = new int[5];
        hamptonImages[0] = R.drawable.ham1;
        hamptonImages[1] = R.drawable.ham2;
        hamptonImages[2] = R.drawable.ham3;
        hamptonImages[3] = R.drawable.ham4;
        hamptonImages[4] = R.drawable.ham5;

        hampton.setImagesResources(hamptonImages);
        hampton.setScore(3);
        hampton.setAddress("157 Waterloo Road");
        hampton.setPostCode("London");
        hampton.setDescription("Ovaj objekt (hotel) s s 3 zvjezdice ima sljedeću pogodnost: restoran, a u blizini je ova zanimljivost: Oko Londona.");

        Accommodation doubleTree = new Accommodation();
        doubleTree.setTitle("DoubleTree by Hilton Hotel London");
        doubleTree.setFeaturedImage(R.drawable.dou1);
        int[] doubleTreeImages = new int[5];
        doubleTreeImages[0] = R.drawable.dou1;
        doubleTreeImages[1] = R.drawable.dou2;
        doubleTreeImages[2] = R.drawable.dou3;
        doubleTreeImages[3] = R.drawable.dou4;
        doubleTreeImages[4] = R.drawable.dou5;

        doubleTree.setImagesResources(doubleTreeImages);
        doubleTree.setScore(4);
        doubleTree.setAddress("7 Pepys Street");
        doubleTree.setPostCode("London");
        doubleTree.setDescription("S 4 zvjezdice hotel koji ima: 2 restorane, u blizini je Londonski toranj.");

        Accommodation catalogne = new Accommodation();
        catalogne.setTitle("Hotel Catalogne");
        catalogne.setFeaturedImage(R.drawable.cat1);
        int[] catalogneImages = new int[5];
        catalogneImages[0] = R.drawable.cat1;
        catalogneImages[1] = R.drawable.cat2;
        catalogneImages[2] = R.drawable.cat3;
        catalogneImages[3] = R.drawable.cat4;
        catalogneImages[4] = R.drawable.cat5;

        catalogne.setImagesResources(catalogneImages);
        catalogne.setScore(2);
        catalogne.setAddress("40, rue du Commandant Mouchotte");
        catalogne.setPostCode("Paris");
        catalogne.setDescription("Objekt ima restoran te je blizu brojnih zanimljivosti, među kojima je i Tour Montparnasse");

        accommodations.add(excelsior);
        accommodations.add(dubrovnikPalace);
        accommodations.add(grand);
        accommodations.add(divota);
        accommodations.add(atrium);
        accommodations.add(hilton);
        accommodations.add(radison);
        accommodations.add(hampton);
        accommodations.add(doubleTree);
        accommodations.add(catalogne);

        return accommodations;
    }
}
