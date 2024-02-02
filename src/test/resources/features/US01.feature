Feature: US_01 LinkedIn links of contactpersonen should work porperly


  Scenario: US_01 --> TC01 LinkedIn Links of Contactpersonen are clickable and working properly

    Given go to centric
    Then  click cookies
    Then  click contact
    Then  scroll down to footer
    Then  click LinkedIn Berlina van der Molen, Account Manager
    Then  verify that the LinkedIn Berlina van der Molen, Account Manager is opened correctly
    Then  click LinkedIn Wijnand de Reeder, Sales Manager
    Then  verify that the LinkedIn Wijnand de Reeder, Sales Manager is opened correctly
    Then  click LinkedIn Scott Domhof, Senior Account Manager
    Then  verify that the LinkedIn Scott Domhof, Senior Account Manager is opened correctly
    Then  click LinkedIn Tom Stoutenburg, Manager Sales & Service Delivery Financial Institutions
    Then  verify that the LinkedIn Tom Stoutenburg, Manager Sales & Service Delivery Financial Institutions is opened correctly
    Then  click LinkedIn Bert Matthijssen, Commercieel Manager
    Then  verify that the LinkedIn Bert Matthijssen, Commercieel Manager is opened correctly
    Then  click LinkedIn Franklin van den Berg, Sales Manager
    Then  verify that the LinkedIn Franklin van den Berg, Sales Manager is opened correctly
    And   terminate test
