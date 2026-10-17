import re

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "r") as f:
    sc = f.read()

sc = sc.replace("fun PulseWireNewsScreen(state: GameStateEntity, viewModel: GameViewModel) {", "@Composable\nfun PulseWireNewsScreen(state: GameStateEntity, viewModel: GameViewModel) {")
sc = sc.replace("viewModel.toggleAdCampaign(campaign.agencyId)", "viewModel.haltAdCampaign(campaign.id)")

with open("app/src/main/java/com/example/SmartphoneComponent.kt", "w") as f:
    f.write(sc)

with open("app/src/main/java/com/example/data/GameViewModel.kt", "r") as f:
    gvm = f.read()

gvm = gvm.replace("val val updatedSongs =", "val updatedSongs =")
gvm = gvm.replace("                savingsBalance = newSavings,\n                wealth = state.wealth.copy(", "                banking = state.banking.copy(savingsBalance = newSavings),\n                wealth = state.wealth.copy(")

with open("app/src/main/java/com/example/data/GameViewModel.kt", "w") as f:
    f.write(gvm)
print("Final issues fixed.")
