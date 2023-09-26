import item.Qualite
import jeu.Jeu
import personnage.Personnage

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")

fun main(args: Array<String>) {
    //Instantiation des monstres
    val gobelin = Personnage(
        "Dylan le gobelin",
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
        vitesse = 60,
        endurance = 90)






    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf( gobelin))
    //Lancement du jeu
    jeu.lancerCombat()
}