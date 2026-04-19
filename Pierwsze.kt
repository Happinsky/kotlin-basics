fun obliczCenePoRabacie(cena: Int,rabat: Int): Int{
    return cena-rabat}
class Samochod(val marka: String, val rokprodukcji: Int){
    fun zatrab(){println("UWAGA JEDZIE $marka + $rokprodukcji")}
}
open class Zwierzak(val imie: String){
    fun spij(){println("spie zzz")}
}
class Pies(imie: String, val Rasa: String): Zwierzak(imie){
    fun szczekaj(){println("hau hau")}
}
interface Latajacy{
    fun lec()
}
class Superman : Latajacy{
    override fun lec(){println("Witam jak superman")}
}
class Dron : Latajacy{
    override fun lec(){println("Witam jak dron")}
}
class KontoBankowe(val wlasciciel: String, var Saldo: Int){
    init{println("Stworzono nowe konto")}
    fun wplac(kwota: Int){
        Saldo+=kwota
        println("Aktualne saldo to $Saldo")
    }
}
data class Gra(val tytul: String, val cena: Int, val platforma: String){
    init{println("Stworzono nowa gre $tytul, $cena, $platforma")}
}
interface Zdolnosc{
    fun uzyjMocy()
}
data class Bohater(val nick: String, val poziom: Int, val profesja: String): Zdolnosc{
    init{println("Stworzono nowego bohatera $nick, $profesja, $poziom")}
    override fun uzyjMocy(){when(profesja){
        "Wojownik" -> println("Wojownik")
        "Mag" -> println("Mag")
        "Fajfus" -> println("Fajfus")
        "Strzelec" -> println("Strzelec")
        else -> println("Nieznane")
    }}

}
enum class PoziomTrudnosci(val obrazeniaPrzeciwnika: Int){
    LATWY(50), NORMALNY(100), TRUDNY(150)
}
fun main() {
    /*
    LEKCJA 1
    var wiek=13
    if(wiek<=15){
        wiek=15-wiek
        println("Niestety jestes za mlody brakuje ci $wiek lat ")
    }
    */
    /*
    LEKCJA 2
    val wiekOsob=listOf(14,18,25,10)
    for (liczba in wiekOsob) {
        if (liczba>=18){
            println("dorosly ma $liczba lat")
        }
        else{println("Dziecko ma $liczba lat")}
    }
   // var kurczak=readLine().toString(
   */
    /*
val wybor=2
when(wybor){
    1 -> println("Wydaje Woda")
    2 -> println("Wydaje Cola")
    3 -> println("Wydaje Sok")
    else -> println("Blad nieznany wybor")
}
*/
    println(obliczCenePoRabacie(5,2))
    var ulubionaGra:String? = "Cs2"
    ulubionaGra = null
    ulubionaGra = "Wiedzmin"
    println(ulubionaGra)
    val mojeAuto=Samochod("Skoda",2000)
    println(mojeAuto.marka)
    mojeAuto.zatrab()
    val kundel=Pies("Figa","Kundel")
    kundel.spij()
    kundel.szczekaj()
    val gigasuperman=Superman()
    val gigadron=Dron()
    val lista=listOf(gigasuperman, gigadron)
    for (i in lista) {
        i.lec()

    }
    val nowekonto=KontoBankowe("Szymczak",50)
    nowekonto.wplac(10)
    val gra1=Gra("Wiedzmin",50,"Ps5")
    val gra2=gra1.copy(platforma = "xbox")
    println(gra2)
    println(gra1)
    val magazyn = mapOf("Wiedzmin" to 10, "CS" to 5, "FIFA" to 3)
    for ((nazwa,ilosc) in magazyn){
        println("Mamy w magazynie gre $nazwa o ilosci $ilosc")
    }
    val ceny=listOf(50,120,80,200,30,150)
    val tanieGry=ceny.filter{it<100}.map{it+5}
    println(tanieGry)
    val druzyna=listOf(Bohater("Andrzej",10,"Mag"),Bohater("Franek",25,"Strzelec"),Bohater("Igly",2,"Fajfus"),Bohater("Artu",55,"Wojownik"))
    for (i in druzyna){println(i.nick)
        i.uzyjMocy()}
    val wybranyPoziom=PoziomTrudnosci.NORMALNY
    println("Na poziomie ${wybranyPoziom.name} bije za ${wybranyPoziom.obrazeniaPrzeciwnika}")
    for (i in PoziomTrudnosci.values()){
        println("bije za $i ${i.obrazeniaPrzeciwnika}")
    }
    val secik=mutableSetOf(1,2,2,3)
    println(secik.size)
    fun pomnoz(x: Int)=x*2
    val wynik: Int
    if (secik.contains(3)){wynik=pomnoz(5)} else {wynik = 0}
    println(wynik)
}
