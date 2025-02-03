Feature: login outline

  Background: 
    Given Je me connecte sur l application Studiffy

  @ValidCredentials
  Scenario: 
    When Je saisis l adresse mail "proservice@admin.com"
    And Je saisis le motde passe "Password@123"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Dashbord "Tableaux de board"

  @InvalidCredentials
  Scenario Outline: login
    Given Je saisis email invalid "<email>"
    When Je saisis password invalid "<password>"
    Then Je clique sur le bouton se connecter
    And Je verifie message d erreur "<erreur message>"

    Examples: 
      | email                 | password    | erreur message                              |
      | marwalakrab@gmail.com | marwa123    | les informations d identification invalides |
      | proservices@gmail.com | password123 | les informations d identification invalides |

      