@SampleTags
Feature: Sample testcases for Tags

@smoke @regression
Scenario: Tag One
Given Tag Step one

@sanity @smoke @regression @skip
Scenario: Tag Two
Given Tag Step two

@sanity @regression @skip
Scenario: Tag Three
Given Tag Step three

@smoke @sanity @skip
Scenario: Tag Four
Given Tag Step four

@smoke
Scenario: Tag Five
Given Tag Step five

@sanity
Scenario: Tag Six
Given Tag Step six

@regression
Scenario: Tag Seven
Given Tag Step seven
