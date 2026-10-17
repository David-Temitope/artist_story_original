cat << 'INNER' > apply.py
import re
with open('app/src/main/java/com/example/data/GameData.kt', 'r') as f:
    content = f.read()

instruments_new = """    val INSTRUMENTS = listOf(
        Instrument("synth_prophet", "Prophet Rev2 8-Voice", cost = 2200.0, ratingBonus = 0.35f),
        Instrument("synth_moog", "Moog Modular System Studio 55", cost = 14500.0, ratingBonus = 0.70f),
        Instrument("synth_jupiter", "Roland Jupiter-X Synthesizer", cost = 2800.0, ratingBonus = 0.40f),
        Instrument("synth_kronos", "Korg Kronos 88-Key Flagship", cost = 3900.0, ratingBonus = 0.45f),
        Instrument("strat_60s", "Fender Custom 1960 Stratocaster", cost = 4500.0, ratingBonus = 0.45f),
        Instrument("gibson_lespaul", "Gibson Les Paul 1959 Reissue", cost = 6800.0, ratingBonus = 0.55f),
        Instrument("martin_d28", "Martin D-28 Authentic Acoustic", cost = 3600.0, ratingBonus = 0.40f),
        Instrument("ssl_console", "SSL 4000 G-Series Console Unit", cost = 18500.0, ratingBonus = 0.80f),
        Instrument("neve_1073", "Neve 1073 Dual Preamp Strip", cost = 3800.0, ratingBonus = 0.45f),
        Instrument("la2a_comp", "Teletronix LA-2A Leveling Amplifier", cost = 4200.0, ratingBonus = 0.50f),
        Instrument("mic_u87", "Neumann U87 Ai Multi-Pattern", cost = 3600.0, ratingBonus = 0.45f),
        Instrument("mic_c800g", "Sony C-800G Tube Studio Condenser", cost = 11000.0, ratingBonus = 0.75f)
    )"""

luxury_new = """    val LUXURY_ITEMS = listOf(
        LuxuryItem(
            id = "lux_rolex",
            name = "Rolex Oyster Perpetual Gold",
            description = "+20 Public Image • +15 Prestige",
            cost = 35000.0,
            perks = "+20 Public Image, +15 Prestige",
            unlockRequirement = ""
        ),
        LuxuryItem(
            id = "lux_cuban",
            name = "18k Solid Diamond Cuban Chain",
            description = "+18 Public Image • +12 Prestige",
            cost = 28000.0,
            perks = "+18 Public Image, +12 Prestige",
            unlockRequirement = ""
        ),
        LuxuryItem(
            id = "lux_tailor",
            name = "Italian Bespoke Tailored Wardrobe",
            description = "+15 Public Image • +10 Prestige",
            cost = 12000.0,
            perks = "+15 Public Image, +10 Prestige",
            unlockRequirement = ""
        ),"""

cars_new = """    val CARS = listOf(
        Car("car_sedan", "Beat-up Sedan", cost = 5000.0, costReductionPercent = 0.15f),
        Car("car_suv", "Midrange SUV", cost = 15000.0, costReductionPercent = 0.30f),
        Car("car_sports", "Luxury Sports Coupe", cost = 60000.0, costReductionPercent = 0.50f),
        Car("car_bus", "Touring Coach Bus", cost = 25000.0, costReductionPercent = 0.80f),
        Car("ferrari_sf90", "Ferrari SF90 Stradale Hybrid", cost = 620000.0, costReductionPercent = 0.90f),
        Car("rolls_phantom", "Rolls-Royce Phantom Series II", cost = 480000.0, costReductionPercent = 0.90f)
    )"""

houses_new = """    val HOUSES = listOf(
        House("house_studio", "Cozy Studio Apartment", cost = 20000.0, energyBonus = 5),
        House("house_townhouse", "Suburban Townhouse", cost = 80000.0, energyBonus = 12),
        House("house_loft", "Downtown Loft", cost = 200000.0, energyBonus = 25),
        House("house_mansion", "Sunset Hills Mansion", cost = 1000000.0, energyBonus = 50),
        House("skyline_penthouse", "Skyline View Penthouse & Studio", cost = 4250000.0, energyBonus = 35),
        House("coastal_villa", "Coastal Villa - The Glass Pavilion", cost = 5100000.0, energyBonus = 50)
    )"""

content = re.sub(r'val INSTRUMENTS = listOf\(.*?\)', instruments_new, content, flags=re.DOTALL)
content = re.sub(r'val CARS = listOf\(.*?\)', cars_new, content, flags=re.DOTALL)
content = re.sub(r'val HOUSES = listOf\(.*?\)', houses_new, content, flags=re.DOTALL)
content = re.sub(r'val LUXURY_ITEMS = listOf\(', luxury_new, content, count=1)

with open('app/src/main/java/com/example/data/GameData.kt', 'w') as f:
    f.write(content)
INNER
python3 apply.py
