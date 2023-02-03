#resitron
**Projet Resistron**

 1. ***Description du projet :***
Ce programme ce programme a pour but de calculer la valeur d'une résistance a 4 couleurs, pour ensuite que celui-ci affiche la valeur, l'unité ainsi que la tolérance de celle-ci.
Il est utilisable par des personnes daltoniennes.
Pour cela il faut sélectionner les couleurs de votre résistance dans les listes disponible de haut en bas.
Vous constaterez que la couleur des labels en début de chaque ligne (Band 1 à 4), ainsi que le schéma de la résistance dans le coin inférieur gauche prendrons les couleurs que vous aurez choisis.
De plus la valeur de chaque anneaux sera alors indiqué dans le bas au centre a la suite des labels "Value Band 1 à 4 :".
Enfin dans le coin inférieur droit vous trouverez alors, le résultat du calcul de la valeur de votre résistance, l'unité Ohms, KOhms, MOhms ou GOhms seront alors affichées, ainsi que la tolérance.

 2. ***Outils de réalisation :***
*Code réalisé avec :* Intellij
Projet réalisé en JavaFX et Java
*Interface graphique :* crée via SceneBuilder
Contient 2 page de code.

 3. ***Type de code utilisé :***
 JavaFX
 Java
 Import @FXML de l'interface graphique réalisé sous Scenebuilder.

 5. ***Page de code de Class Java : ResistronController***
*Librairies utilisées :*
import javafx.fxml.FXML;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.Background;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import java.math.BigDecimal;

 5. ***Page de code de Class JavaFX : ResistronApplication***
*Librairies utilisées :*
import javafx.application.Application;  
import javafx.fxml.FXMLLoader;  
import javafx.stage.Stage;  
import java.io.IOException;

 6. ***Installation du projet :***
*Prérequis :* 
*SceneBuilder :* maquette programme présente dans le répertoire du projet a l'emplacement suivant :
Resistron\src\main\resources\com\example\resistron
*Intellij* (ou un logiciel similaire de codage)
Aucun prérequis matériels particulier, ce program est très léger.

 7. Equipes :
 Nous avons réalisés ce projet en équipe de 3, cependant chacun a codé de sont coté, nous avons partagé et discuter des problèmes rencontrés ensemble, mais nous tenions tous a le réaliser du début a la fin a notre manière.

**Merci d'avoir pris le temp de lire le readme**
# resistron
