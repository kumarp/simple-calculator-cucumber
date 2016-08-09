Feature: Calculator Division

Notes:
- The calculator is only required to support integer division at this time

#====================================================================

Scenario: Dividing two positive numbers

Given the following calculator input:
| Operand 1 | Operand 2 |
| 15        | 5         |

When I do a division calculation

Then I expect the result 3


#====================================================================

Scenario: Dividing zero and one positive number

Given the following calculator input:
| Operand 1 | Operand 2 |
| 0         | 6         |

When I do a division calculation

Then I expect the result 0


#====================================================================

Scenario: Dividing a positive and negative number

Given the following calculator input:
| Operand 1 | Operand 2 |
| 10        | -2        |

When I do a division calculation

Then I expect the result -5

