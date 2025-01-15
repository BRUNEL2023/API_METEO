
LIEN GUIT : https://github.com/BRUNEL2023/API_METEO

QQUESTION 13 :

	URL d'appel /greeting : Param�tr�e avec @GetMapping("/greeting").
	
	Fichier HTML � afficher : Choisi avec return "greeting";.
	
	Nom envoy� via l'URL : Pass� comme param�tre ENSIM dans l'URL et r�cup�r� avec @RequestParam, puis transmis au template via model.addAttribute("nomTemplate", nameGET);.

QUESTION 17 :

	OUI, j'ai remarqu� une diff�rence apr�s avoir relanc� l'application, une nouvelle table nomm�e `ADDRESS` est apparue dans la base de donn�esqui ainsi que ses m�thodes qui ont aussi �t� ajout�e. 
	
QUESTION 18 :

	La table `ADDRESS` a �t� cr��e automatiquement par Hibernate. Voici pourquoi :


   Spring Boot utilise Hibernate comme impl�mentation par d�faut de JPA. Lors du d�marrage, Hibernate analyse toutes les classes annot�es avec `@Entity` et cr�e automatiquement les table correspondantes dans la base de donn�e;


   La classe `Address` est annot�e avec `@Entity`, ce qui indique qu'elle doit �tre mapp�e � une table dans la base de donn�e;


   Chaque propri�t� de la classe `Address` (telle que `id`, `creation`, et `content`) a �t� mapp�e � une colonne dans la table `ADDRESS`.

Ainsi, Hibernate a automatiquement g�n�r� la table `ADDRESS` pour correspondre � l'entit� `Address`. 

QUESTION 20 : 


	Apr�s avoir relanc� l'application et ex�cut� une requ�te SELECT sur la table address, voici le contenu observ� :

 id      	creation              	 content                                     

 1    		(timestamp actuel)    	 57 boulevard demorieux                      
 2    		(timestamp actuel)   	 51 allee du gamay, 34080 montpellier
 
 
QUESTION 23

L'annotation @Autowired de Spring sert � injecter automatiquement une d�pendance dans une classe. Dans le code fourni, elle est utilis�e pour injecter une instance de AddressRepository dans le contr�leur AddressController.

QUESTION 30

Pour int�grer Bootstrap dans notre application Spring Boot, nous avons utilis� les WebJars, qui permettent d'inclure facilement des biblioth�ques front-end.



1. 
    - j'ai ajout� la d�pendance Bootstrap au fichier `pom.xml` :
      
      <dependency>
          <groupId>org.webjars</groupId>
          <artifactId>bootstrap</artifactId>
          <version>5.3.0</version> <!-- Utilisez la derni�re version disponible -->
      </dependency>
      

2. 
    - Dans nos fichiers HTML, nous avons inclus les fichiers CSS et JS de Bootstrap en utilisant les chemins fournis par WebJars :
    
      <!-- Lien vers le CSS de Bootstrap -->
      <link rel="stylesheet" th:href="@{/webjars/bootstrap/5.3.0/css/bootstrap.min.css}" />
      
      <!-- Script JS de Bootstrap -->
      <script th:src="@{/webjars/bootstrap/5.3.0/js/bootstrap.bundle.min.js}"></script>

Cela permet d'utiliser toutes les fonctionnalit�s de Bootstrap pour styliser notre application.

TP4 : 

Questions et Réponses

 1. Faut-il une clé API pour appeler MeteoConcept ?
Oui, une clé API est nécessaire pour appeler l'API MeteoConcept. Vous devez créer un compte sur leur site pour obtenir votre clé personnelle.

2. Quelle URL appeler ?
L'URL à appeler pour obtenir les prévisions météo quotidiennes est :

https://api.meteoconcept.com/forecast/daily


 3. Quelle méthode HTTP utiliser ?
La méthode HTTP à utiliser est **GET**.

### 4. Comment passer les paramètres d'appels ?
Les paramètres doivent être passés dans l'URL en tant que paramètres de requête (**query parameters**). Les principaux paramètres sont :
- **token** : Votre clé API pour l'authentification.
- **lat** : La latitude du lieu.
- **lon** : La longitude du lieu.

Exemple

https://api.meteoconcept.com/forecast/daily?token=MA_CLE_API&lat=48.8566&lon=2.3522

