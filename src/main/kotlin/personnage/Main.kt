package personnage

import item.Bombe
import item.Potion
import jeu.Jeu

//instanciation des qualités des objets
val qualiteCommun = Qualite("commun", 0, "\u001B[32m")
val qualiteRare = Qualite("rare", 1, couleur = "\u001B[34m")
val qualiteEpic = Qualite("epic", 2, "\u001B[35m")
val qualiteLegendaire = Qualite("legendaire", 3, "\u001B[33m")


//Intantation des types d'armes
val EpeeLongue = TypeArme(10,2,2.0,3)
val Lance=TypeArme(1,30,1.5, 4)
val Corps=TypeArme(1,10, 0.3,1)
val epée=TypeArme(1,15,0.5,3)


//Intantation des types d'armures
val leger=TypeArmure(nom = "Léger", BonusType = 2)
val cuir=TypeArmure(nom = "Cuir", BonusType = 2)
val coteDemaille=TypeArmure(nom = "Cote de Maille", BonusType = 6)
val typeExtraLegendaire=TypeArmure(nom= "Berbèrie", BonusType = 216)



//instanciation des armes


fun main(){

//Instantation des armes
    val  main = Arme(
        nom = "Tes propres main",
        description = "Tu connais l'expression on fait avec ce que l'on a sous la main... bah t'as rien lol ratio",
        type = Corps,
        qualité = qualiteCommun,
        degats = 2)

    val  dague = Arme(
        nom = "Tes propres main",
        description = "Tu connais l'expression on fait avec ce que l'on a sous la main... bah t'as rien lol ratio",
        type = epée,
        qualité = qualiteEpic,
        degats = 7*2)

    val  excalibruh = Arme(
        nom = "excalibruh",
        description = "A cause de droits d'auteur, on peut pas le dire",
        type = EpeeLongue,
        qualité = qualiteEpic,
        degats = 20)

    val Guandao = Arme(
        nom = "Guandao",
        description = "",
        type = Lance,
        qualité = qualiteLegendaire,
        degats = 35
    )

    val claquette = Arme(
        nom = "Babouche",
        description = "Fonction 1 : Arme de destruction massive , Fonction 2 : Claquette ",
        type = Corps,
        qualité = qualiteRare,
        degats = 5*2
    )


    // Instantation des armures
    val voile = Armure (
        nom = " Voile Sacréééééééééééé",
        description = "oui c'est leger un voile pour une armure mais lui il est Sacré avec 12 é",
        type = leger,
        qualite = qualiteCommun
    )

    val lourd = Armure (
        nom = " l'armure du berbère EXXXTTTRême",
        description = "Le berbère originel ⵣ (il se transmet de berbère en berbère)",
        type = typeExtraLegendaire,
        qualite = qualiteLegendaire,
    )

    val Tong = Armure(
        nom = "Tong",
        description = "Fonction 1 : Claquette, Fonction 2 : Arme de destruction massive",
        type = leger,
        qualite = qualiteRare
    )

    val lacosteTn = Armure (
        nom = "lacoste Tn",
        description = "Excuse nous la caillé",
        type = cuir,
        qualite = qualiteLegendaire,
    )

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
    val Slime = Personnage(
        "Slipmane le slime",
        pointDeVie = 10,
        pointDeVieMax = 20,
        attaque = 5,
        defense = 4,
        endurance = 6 ,
        vitesse = 11 ,
        armePrincipal = null,
        armure = null,
        inventaire = mutableListOf()
    )

    val djin = Personnage( //monstre de madame
        "DjJnoun",
        pointDeVie = 20,
        pointDeVieMax = 216,
        attaque = 200,
        defense = 140,
        endurance = 90 ,
        vitesse =  110,
        armePrincipal = main,
        armure = null,
        inventaire = mutableListOf()
    )


    val khouna = Personnage (
        nom = "Roi~Khouna",
        pointDeVie = 20,
        pointDeVieMax = 216,
        attaque = 200,
        defense = 200,
        endurance = 90,
        vitesse = 10,
        armePrincipal = null,
        armure = null,
        inventaire = mutableListOf(),
    )

    val Maman = Personnage(
        nom = "khalti hasna",
        pointDeVie = 20,
        pointDeVieMax = 216,
        attaque = 200,
        defense = 200,
        endurance =  90,
        vitesse =  10000,
        armePrincipal = claquette,
        armure = Tong,
        inventaire = mutableListOf()
    )

    val eggman = Personnage(
        "Eggman",
        pointDeVie = 180,
        pointDeVieMax = 300,
        attaque = 8,
        defense = 5,
        endurance = 50 ,
        vitesse = 20,
        armePrincipal = excalibruh,
        armure = null,
        inventaire = mutableListOf()
    )

    // TODO Intermission 1 Ajouter d'autres monstres
    //On ajoute les monstres a la liste de monstres du jeu
    val jeu = Jeu(listOf(eggman,Slime,Maman,djin,khouna))
    //Lancement du jeu
    jeu.lancerCombat()
}