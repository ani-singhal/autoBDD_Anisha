$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Colorchange.feature");
formatter.feature({
  "line": 2,
  "name": "Validate the automationProject cucumber feature",
  "description": "",
  "id": "validate-the-automationproject-cucumber-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Suit"
    }
  ]
});
formatter.before({
  "duration": 6013102100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The user is at the given Website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.The_user_is_at_the_given_Website()"
});
formatter.result({
  "duration": 292934000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User should be able change background color",
  "description": "",
  "id": "validate-the-automationproject-cucumber-feature;user-should-be-able-change-background-color",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Set SkyBlue Background button exists",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.Set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 410800,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.StepDefination.Set_SkyBlue_Background_button_exists(StepDefination.java:33)\r\n\tat ✽.When Set SkyBlue Background button exists(features/Colorchange.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.I_click_on_the_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.The_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "skipped"
});
});