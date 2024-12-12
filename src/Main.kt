fun main(args: Array<String>)
{
    var opt = 0;

    println("Introdueix el que vols fer : ")
    println("1-HowBigIsMyPizza")
    println("2-AirVolumeCalculator")
    opt = readln().toInt();

    when (opt) {
        1 -> HowBigIsMyPizza()
        2 -> AirVolumeCalculator()
        else -> print("Sortint del programa")
    }
}

fun AirVolumeCalculator() {
    val area: Array<Float> = arrayOf(0f,0f,0f)
    println("Introdueix la base:")
    area[0]= readln().toFloat()
    println("Introdueix la alçada:")
    area[1]= readln().toFloat()
    println("Introdueix la profunditat:")
    area[2]= readln().toFloat()

    println("El volum es ${area[0]*area[1]*area[2]}")
}

fun HowBigIsMyPizza()
{
    println("Quantes pizzes " +
            "tens?")
    val qty = readln().toInt();
    var size :Float = 0f;
    for (i in 0..< qty){
        println("Com de gran es la pizza?")
        size = readln().toFloat();
        size = size/2;
        size = (Math.PI * (size * size)).toFloat();
        println("La mida es $size")
    }
}