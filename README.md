PVA_3I_21.11

Správa aut – Java OOP projekt

Tento projekt slouží jako procvičení objektově orientovaného programování v Javě.
Obsahuje implementaci základní třídy Auto, dvou podtříd, správce aut s filtračními a statistickými metodami a demonstrační třídu Main.

## 1. Základní třída – Auto

Třída Auto reprezentuje obecné auto a obsahuje tyto atributy:

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

public String toString() – vrací textovou reprezentaci auta

## 2. Dědičnost – Rozšířené třídy

Projekt obsahuje dvě třídy, které dědí z Auto.

2.1 OsobniAuto extends Auto
Další atributy:
private int pocetMist;
private int velikostKufru; // litry

Metody navíc:

rozšířená verze vypisInfo()

případné gettery/settery

2.2 NakladniAuto extends Auto
Další atributy:
private int nosnost;        // kg
private int aktualniNaklad; // kg

Metody navíc:

public void naloz(int kg) – přidá náklad, nesmí překročit nosnost

public void vyloz(int kg) – odebere náklad, nesmí klesnout pod 0

rozšířená verze vypisInfo()

## 3. Správce aut – SpravceAut

Třída správy uchovává seznam všech aut.

Atribut:
private ArrayList<Auto> seznamAut = new ArrayList<>();

3.1 Základní metody:

public void pridejAuto(Auto a)

public void vypisVsechnaAuta()

3.2 Filtrační metody:

public List<Auto> najdiAutaPodleZnacky(String znacka);

public List<Auto> najdiAutaPodleRoku(int rokOd, int rokDo);

public List<Auto> najdiRychlaAuta(int minRychlost);

public List<NakladniAuto> najdiNakladniAutaSNakladem();

public List<OsobniAuto> najdiOsobniAutaSPocetemMist(int minPocetMist);

## 4. Generování statistik

Třída SpravceAut dále obsahuje statistické metody:

4.1 Průměrné stáří aut
public double prumerneStariAut()


Výpočet: aktuální rok – rok výroby.

4.2 Počet osobních aut
public int pocetOsobnichAut()

4.3 Počet nákladních aut
public int pocetNakladnichAut()

4.4 Nejnovější auto
public Auto nejnovejsiAuto()


Vrací auto s nejvyšším rokem výroby.

## 5. Třída Main – Testování projektu

V metodě main proveďte:

Vytvoření instance správce:

SpravceAut spravce = new SpravceAut();

Vytvoření objektů:

alespoň 3× OsobniAuto

alespoň 2× NakladniAuto

Akce nad auty:

zrychlení

zpomalení

zastavení

naložení a vyložení nákladu

Testování filtračních metod:

hledání aut podle značky

filtrování podle roku

rychlá auta nad určitou rychlost

nákladní auta s nákladem

osobní auta s více než X místy

Vypsání statistik:

průměrné stáří aut

počet osobních aut

počet nákladních aut

nejnovější auto
