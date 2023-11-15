package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "M Raihan"
    val lastName: String = "Aryadevin"
    val age: Int = 20
    val status: Boolean = true

    println("Nama Depan : $firstName")
    println("Nama Belakang : $lastName")
    println("Umur : $age tahun")
    println("Status: ${if (status) "Single" else "Tidak Single"}")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println( "Group : $groupId")

    println("Anggota Group :")
    for (member in groupMember){
        println(" -$member")
    }

    println("Sesi $session")

    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf(
        "Gatot Triantono", "Fauzan Zidni", "Anis Saputri",
        "M. Raihan Aryadevin", "Muhammad Vito Firdaus"
    )

    val myName = groupMembers[3]

    println()
    return listOf(myName)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>(
        "Bg Fatih", "Bg Raihan"
    )
    val countOfGroup = arrayOf<String>(
        "Gatot Triantono", "Fauzan Zidni", "Anis Saputri",
        "M. Raihan Aryadevin", "Muhammad Vito Firdaus", "Della Humairoh",
        "Erika Tangsi Rante", "Ichsan Fadillah", "Abdul Hafizh Subhan",
        "Hamdani Zulva"
    )

    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(
        "Shelter Nerd",

        listOf("Gatot Triantono", "Fauzan Zidni", "Anis Saputri",
            "M. Raihan Aryadevin", "Muhammad Vito Firdaus", "Della Humairoh",
            "Erika Tangsi Rante", "Ichsan Fadillah", "Abdul Hafizh Subhan",
            "Hamdani Zulva"),

        "Morning")

}