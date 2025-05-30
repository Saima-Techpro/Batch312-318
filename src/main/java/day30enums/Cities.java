package day30enums;

public enum Cities {

       /*
    In Java, an enum (enumeration) is a special structure used to represent a fixed set of constant values.
   The enum structure is used to define constants that represent a specific set of values.
   They hold values that are unlikely to change, such as names of months, days, etc., and are written in uppercase.

   The main advantages of enums are:

   Type Safety: A variable defined with an enum can only possess one of the specified enum values.
   This prevents the assignment of invalid values.

   Code Readability: The use of enums increases the readability of the code because you can use constants with meaningful names.

   Code Duplication Reduction: Enums prevent the multiple definitions of the same constant values.
   This reduces code duplication and eliminates dependency on external sources.
   For example, you store the list of cities in your app, and invoke it when needed.
   You don't fetch it from a website, which could be down.
     */

    ADANA(1, "Adana", "01000"),
    ADIYAMAN(2, "Adıyaman", "02000"),
    AFYONKARAHİSAR(3, "Afyonkarahisar", "03000"),
    AĞRI(4, "Ağrı", "04000"),
    AMASYA(5, "Amasya", "05000"),
    ANKARA(6, "Ankara", "06000"),
    ANTALYA(7, "Antalya", "07000"),
    ARTVİN(8, "Artvin", "08000"),
    AYDIN(9, "Aydın", "09000"),
    BALIKESİR(10, "Balıkesir", "10000"),
    BİLECİK(11, "Bilecik", "11000"),
    BİNGÖL(12, "Bingöl", "12000"),
    BİTLİS(13, "Bitlis", "13000"),
    BOLU(14, "Bolu", "14000"),
    BURDUR(15, "Burdur", "15000"),
    BURSA(16, "Bursa", "16000"),
    ÇANAKKALE(17, "Çanakkale", "17000"),
    ÇANKIRI(18, "Çankırı", "18000"),
    ÇORUM(19, "Çorum", "19000"),
    DENİZLİ(20, "Denizli", "20000"),
    DİYARBAKIR(21, "Diyarbakır", "21000"),
    EDİRNE(22, "Edirne", "22000"),
    ELAZIĞ(23, "Elazığ", "23000"),
    ERZİNCAN(24, "Erzincan", "24000"),
    ERZURUM(25, "Erzurum", "25000"),
    ESKİŞEHİR(26, "Eskişehir", "26000"),
    GAZİANTEP(27, "Gaziantep", "27000"),
    GİRESUN(28, "Giresun", "28000"),
    GÜMÜŞHANE(29, "Gümüşhane", "29000"),
    HAKKARİ(30, "Hakkari", "30000"),
    HATAY(31, "Hatay", "31000"),
    ISPARTA(32, "Isparta", "32000"),
    MERSİN(33, "Mersin", "33000"),
    İSTANBUL(34, "İstanbul", "34000"),
    İZMİR(35, "İzmir", "35000"),
    KARS(36, "Kars", "36000"),
    KASTAMONU(37, "Kastamonu", "37000"),
    KAYSERİ(38, "Kayseri", "38000"),
    KIRKLARELİ(39, "Kırklareli", "39000"),
    KIRŞEHİR(40, "Kırşehir", "40000"),
    KOCAELİ(41, "Kocaeli", "41000"),
    KONYA(42, "Konya", "42000"),
    KÜTAHYA(43, "Kütahya", "43000"),
    MALATYA(44, "Malatya", "44000"),
    MANISA(45, "Manisa", "45000"),
    KAHRAMANMARAŞ(46, "Kahramanmaraş", "46000"),
    MARDİN(47, "Mardin", "47100"),
    MUĞLA(48, "Muğla", "48000"),
    MUŞ(49, "Muş", "49000"),
    NEVŞEHİR(50, "Nevşehir", "50000"),
    NİĞDE(51, "Niğde", "51000"),
    ORDU(52, "Ordu", "52000"),
    RİZE(53, "Rize", "53000"),
    SAKARYA(54, "Sakarya", "54100"),
    SAMSUN(55, "Samsun", "55000"),
    SİİRT(56, "Siirt", "56000"),
    SİNOP(57, "Sinop", "57000"),
    SİVAS(58, "Sivas", "58000"),
    TEKİRDAĞ(59, "Tekirdağ", "59000"),
    TOKAT(60, "Tokat", "60000"),
    TRABZON(61, "Trabzon", "61000"),
    TUNCELİ(62, "Tunceli", "62000"),
    ŞANLIURFA(63, "Şanlıurfa", "63000"),
    UŞAK(64, "Uşak", "64000"),
    VAN(65, "Van", "65000"),
    YOZGAT(66, "Yozgat", "66000"),
    ZONGULDAK(67, "Zonguldak", "67000"),
    AKSARAY(68, "Aksaray", "68000"),
    BAYBURT(69, "Bayburt", "69000"),
    KARAMAN(70, "Karaman", "70000"),
    KIRIKKALE(71, "Kırıkkale", "71000"),
    BATMAN(72, "Batman", "72000"),
    ŞIRNAK(73, "Şırnak", "73000"),
    BARTIN(74, "Bartın", "74000"),
    ARDAHAN(75, "Ardahan", "75000"),
    IĞDIR(76, "Iğdır", "76000"),
    YALOVA(77, "Yalova", "77100"),
    KARABÜK(78, "Karabük", "78000"),
    KİLİS(79, "Kilis", "79000"),
    OSMANİYE(80, "Osmaniye", "80000"),
    DÜZCE(81, "Düzce", "81000");

    // Cities => Constant  => ANKARA => constant
    //  its values are : 6, "Ankara", "06000"




    private final int plateCode;
    private final String postalCode;
    private final String cityName;


    // constructor is required to initialise the variables. But we can't use this constructor to create objects

    Cities(int plateCode,  String cityName, String postalCode) {
        this.plateCode = plateCode;
        this.postalCode = postalCode;
        this.cityName = cityName;
    }

    // getters to give the Read Only access to these variables

    public int getPlateCode() {
        return plateCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCityName() {
        return cityName;
    }
}
