$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Rajasekar/Desktop/the british belt factory/Functional/src/test/resources/British.feature");
formatter.feature({
  "name": "Purchase of leather good",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "launch of same bowser",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@two"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "launch the browser, for the search  of bag",
  "keyword": "Given "
});
formatter.match({
  "location": "BBC.launch_the_browser_for_the_search_of_bag()"
});
formatter.result({
  "status": "skipped"
});
});