class Soldier:

    def __init__(self, name, baseAllowance):
        self.name = name
        self.baseAllowance = baseAllowance
        self.grossAllowance = baseAllowance

class Commando:

    def __init__(self, name, baseAllowance, vocationAllowance):
        self.name = name
        self.baseAllowance = baseAllowance
        self.vocationAllowance = vocationAllowance
        self.grossAllowance = vocationAllowance + baseAllowance

c = Commando("Peter", 5000, 200)
s = Soldier("John", 3000)

print("Commando{Soldier{name='" + c.name + "', baseAllowance=" + str(c.baseAllowance) + "}, vocationAllowance=" + str(c.vocationAllowance) + "}")
print("Soldier{name='" + s.name + "', baseAllowance=" + str(s.baseAllowance) + "}")

print("Commando's base allowance : " + str(c.baseAllowance))
print("Commando's gross allowance : " + str(c.grossAllowance))
print("Soldier's base allowance : " + str(s.baseAllowance))
print("Soldier's gross allowance : " + str(s.grossAllowance))
