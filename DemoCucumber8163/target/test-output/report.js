$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Filter.feature");
formatter.feature({
  "name": "verifying all filter options",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "filter options by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "open product page",
  "keyword": "Given "
});
formatter.step({
  "name": "apply filter by \u003cname\u003e of the filter",
  "keyword": "When "
});
formatter.step({
  "name": "verify products are arranged accordingly",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "Name (A to Z)"
      ]
    },
    {
      "cells": [
        "Name (Z to A)"
      ]
    },
    {
      "cells": [
        "Price (low to high)"
      ]
    },
    {
      "cells": [
        "Price (high to low)"
      ]
    }
  ]
});
formatter.scenario({
  "name": "filter options by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "open product page",
  "keyword": "Given "
});
formatter.match({
  "location": "FilterProduct.open_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apply filter by Name (A to Z) of the filter",
  "keyword": "When "
});
formatter.match({
  "location": "FilterProduct.apply_filter_by_of_the_filter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products are arranged accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterProduct.verify_products_are_arranged_accordingly()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filter options by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "open product page",
  "keyword": "Given "
});
formatter.match({
  "location": "FilterProduct.open_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apply filter by Name (Z to A) of the filter",
  "keyword": "When "
});
formatter.match({
  "location": "FilterProduct.apply_filter_by_of_the_filter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products are arranged accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterProduct.verify_products_are_arranged_accordingly()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filter options by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "open product page",
  "keyword": "Given "
});
formatter.match({
  "location": "FilterProduct.open_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apply filter by Price (low to high) of the filter",
  "keyword": "When "
});
formatter.match({
  "location": "FilterProduct.apply_filter_by_of_the_filter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products are arranged accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterProduct.verify_products_are_arranged_accordingly()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "filter options by name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "open product page",
  "keyword": "Given "
});
formatter.match({
  "location": "FilterProduct.open_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "apply filter by Price (high to low) of the filter",
  "keyword": "When "
});
formatter.match({
  "location": "FilterProduct.apply_filter_by_of_the_filter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products are arranged accordingly",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterProduct.verify_products_are_arranged_accordingly()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Feature/SelectProduct.feature");
formatter.feature({
  "name": "Select Product",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "login into application",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectProduct.login_into_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Select with Product name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@functional"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Click on product with Name as \"Sauce Labs Backpack\" on product page",
  "keyword": "When "
});
formatter.match({
  "location": "SelectProduct.click_on_product_with_Name_as_on_product_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product page should open",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectProduct.product_page_should_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add it to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SelectProduct.add_it_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify product is added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SelectProduct.verify_product_is_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
});