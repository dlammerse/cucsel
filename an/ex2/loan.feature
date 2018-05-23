Feature: Loan request

  Scenario: request a car loan
    Given I have opened the loan request page
    And I select loan type 'Car-loan'
    And the amount I want to borrow is '2000'
    And I continue to explanation
    And I  select that i have knowledge
    And I  select continue to personal data
    And I fill in name Capgemini
    And I choose gender male
    And I fill in date of birth 01-Jan-1970
    And I fill in adress Teststraat 1
    And I fill in phone number 0612345678
    And I fill in bank account NL01INGB0123456789
    And I fill in gross income 35000
    And I fill in housing costs 1000
    And I choose living situation rental
    And I choose maritial status single
    And I choose income type permanent contract
    And I upload payment slip
    And I upload indentification
