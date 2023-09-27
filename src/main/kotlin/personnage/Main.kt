package personnage

import item.Bombe
import item.Potion
import jeu.Jeu

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")


//instanciation des armes
val EpeeLongue = TypeArme(10,2,2,3)
fun main(args: Array<String>) {
    //Instantation des potions
    val yop = Potion(
        nom = "Yop",
        soin = 8,
        description = "PREND MOI UN YOP!!! (ces dernieres paroles...)",
    )

    val eaudejaval= Potion(
        nom = "Eau de Javel",
        soin = -3,
        description = "Avant je les lavais avec de l'eau..."
    )
    val  jd = Potion(
        nom = "Jack-Daniel",
        soin = 25,
        description = "Avant l'effort...",
    )
    //Instantation des Bombes

    val bomboclaat = Bombe(
        nom = "BOMBOCLAAAAAT",
        nombreDeDes = 3,
        maxDe = 10,
        description = "Avant cette explosion, laisser moi vous parler de Nord VP~~~",
    )

    val creeper = Bombe(
        nom = "Creeper",
        nombreDeDes=1,
        maxDe = 50,
        description = "Ooh man~"
    )

    val petard = Bombe(
        nom = "Petard",
        nombreDeDes = 1,
        maxDe = 5,
        description = "On va rendre justice à personne avec ces dégats -_-",
    )

    val petardDeGuerre = Bombe(
        nom = "Le Petard de Guerre",
        nombreDeDes = 1,
        maxDe = 70,
        description = "JUSTICE POUR ADAMA VRAIMENT",
    )

    //Instantiation des monstres
    val haterTwitch = Personnage(
        "Léna zie",
        pointDeVie = 10,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        vitesse = 11,
        endurance = 6)

    val jnoun = Personnage( //monstre de madame
        "DjJnoun",
        pointDeVie = 20,
        pointDeVieMax = 216,
        attaque = 200,
        defense = 140,
        vitesse = 110,
        endurance = 90)

    val khouna = Personnage (
        nom = "Roi~Khouna",
        pointDeVie = 20,
        pointDeVieMax = 216,
        attaque = 200,
        defense = 200,
        vitesse = 10,
        endurance = 90)

    val Maman = Personnage(
        nom = "khalti hasna",
        pointDeVie = 20,
        pointDeVieMax = 216,
        attaque = 200,
        defense = 200,
        vitesse = 10000,
        endurance = 90)
    )

    val eggman = Personnage(
        "Eggman",
        pointDeVie = 180,
        pointDeVieMax = 300,
        attaque = 8,
        defense = 5,
        vitesse = 20,
        endurance = 50)

    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf( gobelin))
    //Lancement du jeu
    jeu.lancerCombat()
}