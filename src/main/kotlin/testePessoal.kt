fun main() {
    val horasCall = (6f * 24f)
    val horasLavConsul = (44f / 6f) * 24f

    val valeCall = 10.31f * 24f
    val valeConsul = 500f

    val descCallConsul = 1302 * 0.2
    val descLav = 1708 * 0.09

    val trampoCall = ((1302f + valeCall) - descCallConsul) / horasCall
    val trampoLav = (1708f - descLav) / horasLavConsul
    val trampoConsul = ((1660 + valeConsul) - descCallConsul) / horasLavConsul

    println("Trampo no CallCenter trabalha $horasCall horas e paga $trampoCall a hora")
    println("Trampo na Lav trabalha $horasLavConsul horas e paga $trampoLav a hora")
    println("Trampo na Lav trabalha $horasLavConsul horas e paga $trampoConsul a hora")

}