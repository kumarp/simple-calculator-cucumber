Feature: Calculator Multiplication

Notes:
- The calculator is only required to support integer multiplication at this time

#====================================================================

Scenario: Multiplying two positive numbers

Given the following calculator input:
| Operand 1 | Operand 2 |
| 3         | 5         |

When I do a multiplication calculation

Then I expect the result 15


#====================================================================

Scenario: Multiplying one positive number and zero

Given the following calculator input:
| Operand 1 | Operand 2 |
| 3         | 0         |

When I do a multiplication calculation

Then I expect the result 0


#====================================================================

Scenario: Multiplying zero and zero

Given the following calculator input:
| Operand 1 | Operand 2 |
| 0         | 0         |

When I do a multiplication calculation

Then I expect the result 0

