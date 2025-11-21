PVA_3I_21.11

Správa aut – Java OOP projekt

Tento projekt slouží jako procvičení objektově orientovaného programování v Javě.
Obsahuje implementaci základní třídy Auto, dvou podtříd, správce aut s filtračními a statistickými metodami a demonstrační třídu Main.

## 1. Základní třída – Auto

Třída Auto reprezentuje obecné auto a obsahuje tyto atributy:
```java
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
```

## 2. Dědičnost – Rozšířené třídy

Projekt obsahuje dvě třídy, které dědí z Auto.

2.1 OsobniAuto extends Auto
```java
Další atributy:
private int pocetMist;
private int velikostKufru; // litry

Metody navíc:

rozšířená verze vypisInfo()

případné gettery/settery
```
2.2 NakladniAuto extends Auto
```java
Další atributy:
private int nosnost;        // kg
private int aktualniNaklad; // kg

Metody navíc:

public void naloz(int kg) – přidá náklad, nesmí překročit nosnost

public void vyloz(int kg) – odebere náklad, nesmí klesnout pod 0

rozšířená verze vypisInfo()
```
## 3. Správce aut – SpravceAut

Třída správy uchovává seznam všech aut.
```java
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
```

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
