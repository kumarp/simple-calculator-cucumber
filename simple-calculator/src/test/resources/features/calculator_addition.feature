Feature: Calculator Addition

Notes:
- The calculator is only required to support integer addition at this time

#====================================================================

Scenario: Adding two positive numbers

Given the following calculator input:
| Operand 1 | Operand 2 |
| 3         | 5         |

When I do an addition calculation

Then I expect the result 8


#====================================================================

Scenario: Adding one positive number and zero

Given the following calculator input:
| Operand 1 | Operand 2 |
| 3         | 0         |

When I do an addition calculation

Then I expect the result 3


#====================================================================

Scenario: Adding zero and zero

Given the following calculator input:
| Operand 1 | Operand 2 |
| 0         | 0         |

When I do an addition calculation

Then I expect the result 0

