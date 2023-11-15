package id.infinitelearning.KotlinSubmission.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini

fun main() {

try {
    val no = "abc".toInt()
    println("Nomor : $no")
    } catch (e: NumberFormatException){
        println("Gagal mengonveri String ke Int: ${e.message}")
    }
}



