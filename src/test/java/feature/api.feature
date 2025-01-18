Feature: Test Automation API On https://reqres.in/

  @api
  Scenario: get list data all users
    Given prepare url for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equals 200
    Then validation response body get list user
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @api
  Scenario: create new user valid
    Given prepare url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body post create new user
    Then validation response json with JSONSchema "post_create_new_user_valid.json"

  @api
  Scenario: delete data user normal
    Given prepare url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body post create new user
    And hit api delete new
    Then validation status code is equals 204

  @api
  Scenario: update data user valid
    Given prepare url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equals 201
    Then validation response body post create new user
    And hit api update data user
    Then validation status code is equals 204





