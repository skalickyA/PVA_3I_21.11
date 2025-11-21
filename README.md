# PVA_3I_21.11
PVA_3I_21.11 – Správa Aut (Java OOP Projekt)

Tento projekt slouží jako procvičení objektově orientovaného programování v Javě.
Obsahuje implementaci základní třídy Auto, dvou podtříd, správce aut s filtračními a statistickými metodami a demonstrační třídu Main.

1. Základní třída – Auto

Vytvořte třídu Auto, která bude mít tyto atributy:

private String znacka;
private String model;
private int rokVyroby;
private int rychlost;

Metody třídy Auto

konstruktor – nastaví značku, model a rok výroby
public void zrychli(int oKolik) – zvýší rychlost
public void zpomal(int oKolik) – sníží rychlost (nesmí být pod 0)
public void zastav() – nastaví rychlost na 0
public void vypisInfo() – vypíše kompletní informace o autě
public String toString() – textová reprezentace auta

2. Dědičnost – Rozšířené třídy

Vytvořte dvě podtřídy, které dědí z Auto.

2.1 OsobniAuto extends Auto
Další atributy:
private int pocetMist;
private int velikostKufru; // litry

Metody navíc:
rozšířený vypisInfo()
případně gettery/settery

2.2 NakladniAuto extends Auto
Další atributy:
private int nosnost;        // kg
private int aktualniNaklad; // kg

Metody navíc:
public void naloz(int kg) – přidá náklad, nesmí překročit nosnost
public void vyloz(int kg) – odebere náklad, nesmí klesnout pod 0
rozšířený vypisInfo()

3. Třída správy aut – SpravceAut

Třída uchovává seznam všech aut.

Atribut:
private ArrayList<Auto> seznamAut = new ArrayList<>();

3.1 Základní metody
public void pridejAuto(Auto a)
public void vypisVsechnaAuta()

3.2 Filtrační metody
public List<Auto> najdiAutaPodleZnacky(String znacka);
public List<Auto> najdiAutaPodleRoku(int rokOd, int rokDo);
public List<Auto> najdiRychlaAuta(int minRychlost);
public List<NakladniAuto> najdiNakladniAutaSNakladem();
public List<OsobniAuto> najdiOsobniAutaSPocetemMist(int minPocetMist);

4. Generování statistik

Do třídy SpravceAut přidejte tyto metody:

4.1 Průměrné stáří aut
public double prumerneStariAut()

Výpočet: aktuální rok – rok výroby.

4.2 Počet osobních aut
public int pocetOsobnichAut()

4.3 Počet nákladních aut
public int pocetNakladnichAut()

4.4 Nejnovější auto
public Auto nejnovejsiAuto()

Vrátí auto s nejvyšším rokem výroby.

5. Třída Main – Testování projektu

V metodě main proveďte:

vytvoření instance SpravceAut

vytvoření alespoň:
3 objektů OsobniAuto
2 objektů NakladniAuto

akce nad auty:
zrychlení
zpomalení
zastavení
naložení a vyložení nákladu

zavolání všech filtračních metod:
auta určité značky
auta v rozsahu roků
rychlá auta nad určitou rychlost
nákladní auta, která mají náklad
osobní auta s více než X místy

vypsání statistik:
průměrné stáří aut
počet osobních aut
počet nákladních aut
nejnovější auto
