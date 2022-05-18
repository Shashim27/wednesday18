@apiTesting @regression
Feature: App user should able to create, update, get and delete employee record through API

Scenario: Upskill multiple employee records
	Given Create new employee record in database
	And Update an employee Salary with Increment
	When Get all employee data
	And Get a single employee data by id
	Then Delete an employee record