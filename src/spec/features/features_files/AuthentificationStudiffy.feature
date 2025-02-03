
Feature: Je verifier la page dauthentification
  En tant qu utilisateur je souhaite me connecter au site Studiffy

  @authenification
  Scenario: Je verifier la page dauthentification
    Given Je me connecte sur l application Studiffy
    When Je saisis l adresse mail "marwalakrab@gmail.com"
    And Je saisis le motde passe "Password@123"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Dashbord "Tableaux de board"
   
    
    