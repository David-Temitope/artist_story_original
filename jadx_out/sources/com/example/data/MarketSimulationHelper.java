package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: MarketSimulationHelper.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��H\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0006\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\bÇ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n��\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n��\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/example/data/MarketSimulationHelper;", "", "<init>", "()V", "stockConfigs", "", "", "Lcom/example/data/StockConfig;", "getStockConfigs", "()Ljava/util/Map;", "cryptoSpecs", "Lcom/example/data/CryptoSpec;", "getCryptoSpecs", "simulateStocksAndCryptos", "Lcom/example/data/MarketSimulationResult;", "state", "Lcom/example/data/GameStateEntity;", "economyCycle", "isElectionSeason", "", "hackerCryptoLossRatio", "", "reportBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "app"})
@SourceDebugExtension({"SMAP\nMarketSimulationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketSimulationHelper.kt\ncom/example/data/MarketSimulationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1563#2:363\n1634#2,3:364\n1563#2:367\n1634#2,3:368\n1208#2,2:371\n1236#2,4:373\n1869#2,2:377\n1563#2:379\n1634#2,3:380\n1208#2,2:383\n1236#2,4:385\n1869#2,2:389\n1563#2:391\n1634#2,3:392\n*S KotlinDebug\n*F\n+ 1 MarketSimulationHelper.kt\ncom/example/data/MarketSimulationHelper\n*L\n67#1:363\n67#1:364,3\n152#1:367\n152#1:368,3\n275#1:371,2\n275#1:373,4\n278#1:377,2\n302#1:379\n302#1:380,3\n305#1:383,2\n305#1:385,4\n307#1:389,2\n348#1:391\n348#1:392,3\n*E\n"})
/* loaded from: MarketSimulationHelper.class */
public final class MarketSimulationHelper {
    @NotNull
    public static final MarketSimulationHelper INSTANCE = new MarketSimulationHelper();
    @NotNull
    private static final Map<String, StockConfig> stockConfigs = MapsKt.mapOf(new Pair[]{TuplesKt.to("stock_media", new StockConfig(50.0d, "Broadcasting & Media", 1.0d, 16.5d, "Stable")), TuplesKt.to("stock_apex", new StockConfig(120.0d, "Music Publishing & Distribution", 0.65d, 13.8d, "Strong")), TuplesKt.to("stock_space", new StockConfig(35.0d, "Creative Real Estate", 0.85d, 12.2d, "Stable")), TuplesKt.to("stock_stream", new StockConfig(80.0d, "Digital Streaming Tech", 1.35d, 27.5d, "Strong")), TuplesKt.to("stock_acoustic", new StockConfig(45.0d, "Audio Equipment & Guitars", 0.8d, 11.5d, "Stable")), TuplesKt.to("stock_label", new StockConfig(65.0d, "Independent Labels", 0.9d, 14.0d, "Stable")), TuplesKt.to("stock_auto", new StockConfig(210.0d, "EV & Clean Tech", 1.45d, 36.5d, "Strong")), TuplesKt.to("stock_micro", new StockConfig(185.0d, "Audio DSP & Semiconductors", 1.35d, 23.0d, "Strong")), TuplesKt.to("stock_realestate", new StockConfig(140.0d, "Commercial Real Estate & REIT", 0.6d, 10.8d, "Strong"))});
    @NotNull
    private static final Map<String, CryptoSpec> cryptoSpecs = MapsKt.mapOf(new Pair[]{TuplesKt.to("crypto_bit", new CryptoSpec(45000.0d, 35000.0d, 68000.0d, 1, "High")), TuplesKt.to("crypto_ether", new CryptoSpec(3200.0d, 2400.0d, 4800.0d, 2, "High")), TuplesKt.to("crypto_sol", new CryptoSpec(150.0d, 105.0d, 260.0d, 2, "High")), TuplesKt.to("crypto_ripple", new CryptoSpec(1.2d, 0.85d, 2.2d, 3, "Medium")), TuplesKt.to("crypto_cardano", new CryptoSpec(0.65d, 0.45d, 1.2d, 3, "Medium")), TuplesKt.to("crypto_polka", new CryptoSpec(6.2d, 4.4d, 12.0d, 3, "Medium")), TuplesKt.to("crypto_doge", new CryptoSpec(0.15d, 0.09d, 0.4d, 4, "Low")), TuplesKt.to("crypto_shib", new CryptoSpec(2.5E-5d, 1.5E-5d, 8.0E-5d, 4, "Low"))});
    public static final int $stable = 8;

    private MarketSimulationHelper() {
    }

    @NotNull
    public final Map<String, StockConfig> getStockConfigs() {
        return stockConfigs;
    }

    @NotNull
    public final Map<String, CryptoSpec> getCryptoSpecs() {
        return cryptoSpecs;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public final MarketSimulationResult simulateStocksAndCryptos(@NotNull GameStateEntity state, @NotNull String economyCycle, boolean isElectionSeason, double hackerCryptoLossRatio, @NotNull StringBuilder reportBuilder) {
        float f;
        double nextDouble;
        Pair pair;
        double d;
        double d2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(economyCycle, "economyCycle");
        Intrinsics.checkNotNullParameter(reportBuilder, "reportBuilder");
        double electionVolatility = isElectionSeason ? 1.2d : 1.0d;
        double addedSalary = 0.0d;
        Iterable<Stock> stocks = state.getStocks();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stocks, 10));
        for (Stock stock : stocks) {
            MarketSimulationHelper marketSimulationHelper = INSTANCE;
            StockConfig stockConfig = stockConfigs.get(stock.getId());
            if (stockConfig == null) {
                stockConfig = new StockConfig(RangesKt.coerceAtLeast(stock.getCurrentPrice(), 20.0d), stock.getSector(), 1.0d, 15.0d, "Stable");
            }
            StockConfig stockConfig2 = stockConfig;
            double initialPrice = stock.getInitialPrice() > 0.0d ? stock.getInitialPrice() : stockConfig2.getAnchorPrice();
            double max = Math.max(stock.getAllTimeHigh(), Math.max(stock.getCurrentPrice(), initialPrice));
            String health = stockConfig2.getHealth();
            double nextDouble2 = Intrinsics.areEqual(health, "Strong") ? Random.Default.nextDouble(1.0d, 3.2d) : Intrinsics.areEqual(health, "Stable") ? Random.Default.nextDouble(0.5d, 2.0d) : Random.Default.nextDouble(-0.5d, 1.5d);
            switch (economyCycle.hashCode()) {
                case -1582362413:
                    if (economyCycle.equals("Recession")) {
                        d = Random.Default.nextDouble(-2.6d, 0.3d) * stockConfig2.getBeta();
                        break;
                    }
                    d = 0.0d;
                    break;
                case -848182699:
                    if (economyCycle.equals("Inflation Peak")) {
                        d = Random.Default.nextDouble(-1.5d, 0.6d) * stockConfig2.getBeta();
                        break;
                    }
                    d = 0.0d;
                    break;
                case 2076427:
                    if (economyCycle.equals("Boom")) {
                        d = Random.Default.nextDouble(1.0d, 3.5d) * stockConfig2.getBeta();
                        break;
                    }
                    d = 0.0d;
                    break;
                case 376422534:
                    if (economyCycle.equals("Depression")) {
                        d = Random.Default.nextDouble(-3.8d, 0.0d) * stockConfig2.getBeta();
                        break;
                    }
                    d = 0.0d;
                    break;
                case 1692324428:
                    if (economyCycle.equals("Stable Growth")) {
                        d = Random.Default.nextDouble(0.3d, 1.8d) * stockConfig2.getBeta();
                        break;
                    }
                    d = 0.0d;
                    break;
                default:
                    d = 0.0d;
                    break;
            }
            double d3 = d;
            double nextDouble3 = Random.Default.nextDouble(-2.2d, 3.4d);
            double currentPrice = stock.getCurrentPrice() / initialPrice;
            double d4 = currentPrice >= 3.0d ? -Random.Default.nextDouble(2.5d, 6.5d) : currentPrice >= 2.0d ? -Random.Default.nextDouble(1.5d, 4.5d) : currentPrice >= 1.4d ? -Random.Default.nextDouble(0.5d, 2.5d) : 0.0d;
            double nextDouble4 = currentPrice < 0.85d ? Random.Default.nextDouble(6.0d, 16.0d) : currentPrice < 1.0d ? Random.Default.nextDouble(3.5d, 10.0d) : currentPrice <= 1.1d ? Random.Default.nextDouble(1.0d, 4.5d) : 0.0d;
            double max2 = Math.max(stock.getCurrentPrice() * (1.0d + (((((((nextDouble2 + d3) + nextDouble3) + d4) + nextDouble4) + (Random.Default.nextFloat() < 0.16f ? (((currentPrice > 1.1d ? 1 : (currentPrice == 1.1d ? 0 : -1)) < 0 || Intrinsics.areEqual(economyCycle, "Boom")) || Random.Default.nextFloat() < 0.45f) ? Random.Default.nextDouble(12.0d, 26.0d) : -Random.Default.nextDouble(10.0d, 22.0d) : 0.0d)) * electionVolatility) / 100.0d)), Math.max(3.0d, initialPrice * 0.2d));
            double max3 = Math.max(max, max2);
            List takeLast = CollectionsKt.takeLast(CollectionsKt.plus(stock.getHistory(), Double.valueOf(max2)), 10);
            double coerceIn = RangesKt.coerceIn(stockConfig2.getBasePE() * (max2 / initialPrice), 8.0d, 55.0d);
            switch (economyCycle.hashCode()) {
                case -1582362413:
                    if (economyCycle.equals("Recession")) {
                        d2 = 0.94d;
                        break;
                    }
                    d2 = 1.0d;
                    break;
                case -848182699:
                    if (economyCycle.equals("Inflation Peak")) {
                        d2 = 0.98d;
                        break;
                    }
                    d2 = 1.0d;
                    break;
                case 2076427:
                    if (economyCycle.equals("Boom")) {
                        d2 = 1.05d;
                        break;
                    }
                    d2 = 1.0d;
                    break;
                case 376422534:
                    if (economyCycle.equals("Depression")) {
                        d2 = 0.9d;
                        break;
                    }
                    d2 = 1.0d;
                    break;
                default:
                    d2 = 1.0d;
                    break;
            }
            double quarterlyEarnings = stock.getQuarterlyEarnings() * d2;
            if (stock.getQuantity() > 0) {
                double quantity = stock.getQuantity() * max2 * stock.getWeeklyDividendPercent();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArr = {Double.valueOf(quantity)};
                String format = String.format("%,.2f", Arrays.copyOf(objArr, objArr.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                int quantity2 = stock.getQuantity();
                String name = stock.getName();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Object[] objArr2 = {Double.valueOf(stock.getQuantity() * max2)};
                String format2 = String.format("%,.0f", Arrays.copyOf(objArr2, objArr2.length));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                reportBuilder.append("�� Stock Dividend: Collected $" + format + " cash dividend from " + quantity2 + " shares of " + name + " (Holdings: $" + format2 + ").\n");
                addedSalary += quantity;
            }
            arrayList.add(Stock.copy$default(stock, null, null, max2, 0, 0.0f, null, takeLast, stockConfig2.getSector(), quarterlyEarnings, coerceIn, 0.0f, max2 * 2500000.0d, stockConfig2.getHealth(), 0.0d, initialPrice, max3, null, 0, null, false, 992315, null));
        }
        Iterable updatedStocks = (List) arrayList;
        Iterable<Crypto> cryptos = state.getCryptos();
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cryptos, 10));
        for (Crypto crypto : cryptos) {
            MarketSimulationHelper marketSimulationHelper2 = INSTANCE;
            CryptoSpec cryptoSpec = cryptoSpecs.get(crypto.getId());
            if (cryptoSpec == null) {
                cryptoSpec = new CryptoSpec(crypto.getCurrentPrice(), crypto.getSupportLevel(), crypto.getResistanceLevel(), 2, crypto.getDeveloperActivity());
            }
            CryptoSpec cryptoSpec2 = cryptoSpec;
            double initialPrice2 = crypto.getInitialPrice() > 0.0d ? crypto.getInitialPrice() : cryptoSpec2.getAnchor();
            double max4 = Math.max(crypto.getAllTimeHigh(), Math.max(crypto.getCurrentPrice(), initialPrice2));
            boolean z = max4 / initialPrice2 >= 3.0d;
            double d5 = z ? initialPrice2 * 1.02d : initialPrice2 * 0.65d;
            boolean z2 = crypto.getCurrentPrice() <= (z ? initialPrice2 * 1.12d : cryptoSpec2.getSupport()) * 1.08d || (((crypto.getCurrentPrice() / initialPrice2) > 1.08d ? 1 : ((crypto.getCurrentPrice() / initialPrice2) == 1.08d ? 0 : -1)) <= 0);
            switch (economyCycle.hashCode()) {
                case -1582362413:
                    if (economyCycle.equals("Recession")) {
                        f = 0.38f;
                        break;
                    }
                    f = 0.5f;
                    break;
                case -848182699:
                    if (economyCycle.equals("Inflation Peak")) {
                        f = 0.46f;
                        break;
                    }
                    f = 0.5f;
                    break;
                case 2076427:
                    if (economyCycle.equals("Boom")) {
                        f = 0.72f;
                        break;
                    }
                    f = 0.5f;
                    break;
                case 376422534:
                    if (economyCycle.equals("Depression")) {
                        f = 0.3f;
                        break;
                    }
                    f = 0.5f;
                    break;
                case 1692324428:
                    if (economyCycle.equals("Stable Growth")) {
                        f = 0.58f;
                        break;
                    }
                    f = 0.5f;
                    break;
                default:
                    f = 0.5f;
                    break;
            }
            float f2 = f;
            float nextFloat = Random.Default.nextFloat();
            if (z2) {
                nextDouble = Random.Default.nextFloat() < 0.85f ? Random.Default.nextDouble(20.0d, cryptoSpec2.getTier() <= 2 ? 55.0d : 85.0d) : Random.Default.nextDouble(-3.5d, 4.5d);
            } else if (nextFloat < 0.33f) {
                if (Random.Default.nextFloat() < f2) {
                    switch (cryptoSpec2.getTier()) {
                        case 1:
                            nextDouble = Random.Default.nextDouble(25.0d, 58.0d);
                            break;
                        case 2:
                            nextDouble = Random.Default.nextDouble(30.0d, 85.0d);
                            break;
                        default:
                            nextDouble = Random.Default.nextDouble(38.0d, 110.0d);
                            break;
                    }
                } else {
                    switch (cryptoSpec2.getTier()) {
                        case 1:
                            nextDouble = -Random.Default.nextDouble(14.0d, 26.0d);
                            break;
                        case 2:
                            nextDouble = -Random.Default.nextDouble(18.0d, 32.0d);
                            break;
                        default:
                            nextDouble = -Random.Default.nextDouble(22.0d, 38.0d);
                            break;
                    }
                }
            } else if (nextFloat >= 0.7f) {
                nextDouble = Random.Default.nextDouble(-3.5d, 6.5d);
            } else if (Random.Default.nextFloat() < f2) {
                switch (cryptoSpec2.getTier()) {
                    case 1:
                        nextDouble = Random.Default.nextDouble(8.0d, 18.0d);
                        break;
                    case 2:
                        nextDouble = Random.Default.nextDouble(10.0d, 24.0d);
                        break;
                    default:
                        nextDouble = Random.Default.nextDouble(12.0d, 28.0d);
                        break;
                }
            } else {
                switch (cryptoSpec2.getTier()) {
                    case 1:
                        nextDouble = -Random.Default.nextDouble(6.0d, 15.0d);
                        break;
                    case 2:
                        nextDouble = -Random.Default.nextDouble(8.0d, 18.0d);
                        break;
                    default:
                        nextDouble = -Random.Default.nextDouble(10.0d, 24.0d);
                        break;
                }
            }
            double d6 = nextDouble;
            String id = crypto.getId();
            switch (id.hashCode()) {
                case -1992076145:
                    if (id.equals("crypto_bit")) {
                        pair = new Pair(Double.valueOf(20000.0d), Double.valueOf(120000.0d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case -1992059630:
                    if (id.equals("crypto_sol")) {
                        pair = new Pair(Double.valueOf(50.0d), Double.valueOf(450.0d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case -1919248530:
                    if (id.equals("crypto_ripple")) {
                        pair = new Pair(Double.valueOf(0.4d), Double.valueOf(2.5d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case -1624753305:
                    if (id.equals("crypto_doge")) {
                        pair = new Pair(Double.valueOf(0.05d), Double.valueOf(0.45d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case -1624313108:
                    if (id.equals("crypto_shib")) {
                        pair = new Pair(Double.valueOf(5.0E-6d), Double.valueOf(6.0E-5d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case -22369452:
                    if (id.equals("crypto_cardano")) {
                        pair = new Pair(Double.valueOf(0.3d), Double.valueOf(2.0d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case 1173328648:
                    if (id.equals("crypto_ether")) {
                        pair = new Pair(Double.valueOf(1500.0d), Double.valueOf(7000.0d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                case 1183342437:
                    if (id.equals("crypto_polka")) {
                        pair = new Pair(Double.valueOf(3.0d), Double.valueOf(45.0d));
                        break;
                    }
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
                default:
                    pair = new Pair(Double.valueOf(initialPrice2 * 0.5d), Double.valueOf(initialPrice2 * 5.0d));
                    break;
            }
            Pair pair2 = pair;
            double doubleValue = ((Number) pair2.component1()).doubleValue();
            if (crypto.getCurrentPrice() > ((Number) pair2.component2()).doubleValue() * Random.Default.nextDouble(1.0d, 1.15d)) {
                d6 = Random.Default.nextDouble(-35.0d, -10.0d);
            } else if (crypto.getCurrentPrice() < doubleValue * Random.Default.nextDouble(0.85d, 1.0d)) {
                d6 = Random.Default.nextDouble(10.0d, 35.0d);
            }
            double max5 = Math.max(crypto.getCurrentPrice() * (1.0d + ((d6 * electionVolatility) / 100.0d)), Math.max(1.0E-6d, initialPrice2 * 0.15d));
            double max6 = Math.max(max4, max5);
            List takeLast2 = CollectionsKt.takeLast(CollectionsKt.plus(crypto.getHistory(), Double.valueOf(max5)), 10);
            double coerceAtLeast = hackerCryptoLossRatio < 1.0d ? RangesKt.coerceAtLeast(crypto.getQuantity() * hackerCryptoLossRatio, 0.0d) : crypto.getQuantity();
            double support = max6 >= initialPrice2 * 3.0d ? initialPrice2 * 1.08d : cryptoSpec2.getSupport();
            double max7 = Math.max(max6 * 1.06d, max5 * 1.25d);
            if (crypto.getQuantity() > 0.0d) {
                double quantity3 = crypto.getQuantity() * max5;
                double currentPrice2 = ((max5 - crypto.getCurrentPrice()) / crypto.getCurrentPrice()) * 100.0d;
                if (currentPrice2 >= 20.0d) {
                    String name2 = crypto.getName();
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    Object[] objArr3 = {Double.valueOf(currentPrice2)};
                    String format3 = String.format("%.1f", Arrays.copyOf(objArr3, objArr3.length));
                    Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    Object[] objArr4 = {Double.valueOf(max5)};
                    String format4 = String.format("%,.2f", Arrays.copyOf(objArr4, objArr4.length));
                    Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                    Object[] objArr5 = {Double.valueOf(quantity3)};
                    String format5 = String.format("%,.2f", Arrays.copyOf(objArr5, objArr5.length));
                    Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
                    reportBuilder.append("�� Crypto Breakout: " + name2 + " skyrocketed +" + format3 + "% to $" + format4 + "! Holdings: $" + format5 + ".\n");
                } else if (currentPrice2 <= -14.0d) {
                    String name3 = crypto.getName();
                    StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                    Object[] objArr6 = {Double.valueOf(currentPrice2)};
                    String format6 = String.format("%.1f", Arrays.copyOf(objArr6, objArr6.length));
                    Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
                    StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                    Object[] objArr7 = {Double.valueOf(max5)};
                    String format7 = String.format("%,.2f", Arrays.copyOf(objArr7, objArr7.length));
                    Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
                    reportBuilder.append("⚡ Crypto Shakeout: " + name3 + " dropped " + format6 + "% to $" + format7 + ". High volatility rewards risk-tolerant investors.\n");
                }
            }
            arrayList2.add(Crypto.copy$default(crypto, null, null, max5, coerceAtLeast, takeLast2, max5 * (cryptoSpec2.getTier() == 1 ? 1.95E7d : 1.2E8d), 0.0d, support, max7, cryptoSpec2.getDev(), 0.0d, initialPrice2, max6, d5, null, 0, null, false, 246851, null));
        }
        Iterable updatedCryptos = (List) arrayList2;
        List remainingStockOrders = new ArrayList();
        Iterable iterable = updatedStocks;
        Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object obj : iterable) {
            linkedHashMap.put(((Stock) obj).getId(), obj);
        }
        Map stocksModifiedMap = MapsKt.toMutableMap(linkedHashMap);
        double currentWorkingCash = state.getCash();
        for (StockOrder stockOrder : state.getPendingStockOrders()) {
            Stock stock2 = (Stock) stocksModifiedMap.get(stockOrder.getStockId());
            if (stock2 != null) {
                boolean z3 = false;
                if (Intrinsics.areEqual(stockOrder.getType(), "LIMIT_BUY") && stock2.getCurrentPrice() <= stockOrder.getTargetPrice()) {
                    double currentPrice3 = stock2.getCurrentPrice() * stockOrder.getQuantity();
                    if (currentWorkingCash >= currentPrice3) {
                        currentWorkingCash -= currentPrice3;
                        stocksModifiedMap.put(stockOrder.getStockId(), Stock.copy$default(stock2, null, null, 0.0d, stock2.getQuantity() + stockOrder.getQuantity(), 0.0f, null, null, null, 0.0d, 0.0d, 0.0f, 0.0d, null, 0.0d, 0.0d, 0.0d, null, 0, null, false, 1048567, null));
                        int quantity4 = stockOrder.getQuantity();
                        String name4 = stock2.getName();
                        StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                        Object[] objArr8 = {Double.valueOf(stock2.getCurrentPrice())};
                        String format8 = String.format("%.2f", Arrays.copyOf(objArr8, objArr8.length));
                        Intrinsics.checkNotNullExpressionValue(format8, "format(...)");
                        reportBuilder.append("�� Stock Exchange: LIMIT BUY triggered! Bought " + quantity4 + " shares of " + name4 + " at $" + format8 + "/share.\n");
                        z3 = true;
                    }
                } else if (Intrinsics.areEqual(stockOrder.getType(), "LIMIT_SELL") && stock2.getCurrentPrice() >= stockOrder.getTargetPrice() && stock2.getQuantity() >= stockOrder.getQuantity()) {
                    addedSalary += stock2.getCurrentPrice() * stockOrder.getQuantity();
                    stocksModifiedMap.put(stockOrder.getStockId(), Stock.copy$default(stock2, null, null, 0.0d, stock2.getQuantity() - stockOrder.getQuantity(), 0.0f, null, null, null, 0.0d, 0.0d, 0.0f, 0.0d, null, 0.0d, 0.0d, 0.0d, null, 0, null, false, 1048567, null));
                    int quantity5 = stockOrder.getQuantity();
                    String name5 = stock2.getName();
                    StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                    Object[] objArr9 = {Double.valueOf(stock2.getCurrentPrice())};
                    String format9 = String.format("%.2f", Arrays.copyOf(objArr9, objArr9.length));
                    Intrinsics.checkNotNullExpressionValue(format9, "format(...)");
                    reportBuilder.append("�� Stock Exchange: LIMIT SELL triggered! Sold " + quantity5 + " shares of " + name5 + " at $" + format9 + "/share.\n");
                    z3 = true;
                }
                if (!z3) {
                    remainingStockOrders.add(stockOrder);
                }
            }
        }
        Iterable<Stock> iterable2 = updatedStocks;
        Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (Stock stock3 : iterable2) {
            Stock stock4 = (Stock) stocksModifiedMap.get(stock3.getId());
            if (stock4 == null) {
                stock4 = stock3;
            }
            arrayList3.add(stock4);
        }
        List finalStocks = (List) arrayList3;
        List remainingCryptoOrders = new ArrayList();
        Iterable iterable3 = updatedCryptos;
        Map linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable3, 10)), 16));
        for (Object obj2 : iterable3) {
            linkedHashMap2.put(((Crypto) obj2).getId(), obj2);
        }
        Map cryptosModifiedMap = MapsKt.toMutableMap(linkedHashMap2);
        for (CryptoOrder cryptoOrder : state.getPendingCryptoOrders()) {
            Crypto crypto2 = (Crypto) cryptosModifiedMap.get(cryptoOrder.getCryptoId());
            if (crypto2 != null) {
                boolean z4 = false;
                double currentPrice4 = crypto2.getCurrentPrice();
                if (Intrinsics.areEqual(cryptoOrder.getType(), "LIMIT_BUY") && currentPrice4 <= cryptoOrder.getTargetPrice()) {
                    double quantity6 = currentPrice4 * cryptoOrder.getQuantity();
                    if (currentWorkingCash >= quantity6) {
                        currentWorkingCash -= quantity6;
                        cryptosModifiedMap.put(cryptoOrder.getCryptoId(), Crypto.copy$default(crypto2, null, null, 0.0d, crypto2.getQuantity() + cryptoOrder.getQuantity(), null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, false, 262135, null));
                        StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
                        Object[] objArr10 = {Double.valueOf(cryptoOrder.getQuantity())};
                        String format10 = String.format("%.4f", Arrays.copyOf(objArr10, objArr10.length));
                        Intrinsics.checkNotNullExpressionValue(format10, "format(...)");
                        String name6 = crypto2.getName();
                        StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
                        Object[] objArr11 = {Double.valueOf(currentPrice4)};
                        String format11 = String.format("%.2f", Arrays.copyOf(objArr11, objArr11.length));
                        Intrinsics.checkNotNullExpressionValue(format11, "format(...)");
                        reportBuilder.append("�� Genesis Exchange: LIMIT BUY triggered! Bought " + format10 + " of " + name6 + " at $" + format11 + ".\n");
                        z4 = true;
                    }
                } else if (!Intrinsics.areEqual(cryptoOrder.getType(), "LIMIT_SELL") || currentPrice4 < cryptoOrder.getTargetPrice()) {
                    if (!Intrinsics.areEqual(cryptoOrder.getType(), "STOP_LOSS") || currentPrice4 > cryptoOrder.getTargetPrice()) {
                        if (Intrinsics.areEqual(cryptoOrder.getType(), "TAKE_PROFIT") && currentPrice4 >= cryptoOrder.getTargetPrice() && crypto2.getQuantity() >= cryptoOrder.getQuantity()) {
                            addedSalary += currentPrice4 * cryptoOrder.getQuantity();
                            cryptosModifiedMap.put(cryptoOrder.getCryptoId(), Crypto.copy$default(crypto2, null, null, 0.0d, crypto2.getQuantity() - cryptoOrder.getQuantity(), null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, false, 262135, null));
                            StringCompanionObject stringCompanionObject12 = StringCompanionObject.INSTANCE;
                            Object[] objArr12 = {Double.valueOf(cryptoOrder.getQuantity())};
                            String format12 = String.format("%.4f", Arrays.copyOf(objArr12, objArr12.length));
                            Intrinsics.checkNotNullExpressionValue(format12, "format(...)");
                            String name7 = crypto2.getName();
                            StringCompanionObject stringCompanionObject13 = StringCompanionObject.INSTANCE;
                            Object[] objArr13 = {Double.valueOf(currentPrice4)};
                            String format13 = String.format("%.2f", Arrays.copyOf(objArr13, objArr13.length));
                            Intrinsics.checkNotNullExpressionValue(format13, "format(...)");
                            reportBuilder.append("�� Genesis Exchange: TAKE PROFIT triggered! Sold " + format12 + " of " + name7 + " at $" + format13 + ".\n");
                            z4 = true;
                        }
                    } else if (crypto2.getQuantity() >= cryptoOrder.getQuantity()) {
                        addedSalary += currentPrice4 * cryptoOrder.getQuantity();
                        cryptosModifiedMap.put(cryptoOrder.getCryptoId(), Crypto.copy$default(crypto2, null, null, 0.0d, crypto2.getQuantity() - cryptoOrder.getQuantity(), null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, false, 262135, null));
                        StringCompanionObject stringCompanionObject14 = StringCompanionObject.INSTANCE;
                        Object[] objArr14 = {Double.valueOf(cryptoOrder.getQuantity())};
                        String format14 = String.format("%.4f", Arrays.copyOf(objArr14, objArr14.length));
                        Intrinsics.checkNotNullExpressionValue(format14, "format(...)");
                        String name8 = crypto2.getName();
                        StringCompanionObject stringCompanionObject15 = StringCompanionObject.INSTANCE;
                        Object[] objArr15 = {Double.valueOf(currentPrice4)};
                        String format15 = String.format("%.2f", Arrays.copyOf(objArr15, objArr15.length));
                        Intrinsics.checkNotNullExpressionValue(format15, "format(...)");
                        reportBuilder.append("�� Genesis Exchange: STOP LOSS triggered! Sold " + format14 + " of " + name8 + " at $" + format15 + " to limit loss.\n");
                        z4 = true;
                    }
                } else if (crypto2.getQuantity() >= cryptoOrder.getQuantity()) {
                    addedSalary += currentPrice4 * cryptoOrder.getQuantity();
                    cryptosModifiedMap.put(cryptoOrder.getCryptoId(), Crypto.copy$default(crypto2, null, null, 0.0d, crypto2.getQuantity() - cryptoOrder.getQuantity(), null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, null, 0, null, false, 262135, null));
                    StringCompanionObject stringCompanionObject16 = StringCompanionObject.INSTANCE;
                    Object[] objArr16 = {Double.valueOf(cryptoOrder.getQuantity())};
                    String format16 = String.format("%.4f", Arrays.copyOf(objArr16, objArr16.length));
                    Intrinsics.checkNotNullExpressionValue(format16, "format(...)");
                    String name9 = crypto2.getName();
                    StringCompanionObject stringCompanionObject17 = StringCompanionObject.INSTANCE;
                    Object[] objArr17 = {Double.valueOf(currentPrice4)};
                    String format17 = String.format("%.2f", Arrays.copyOf(objArr17, objArr17.length));
                    Intrinsics.checkNotNullExpressionValue(format17, "format(...)");
                    reportBuilder.append("�� Genesis Exchange: LIMIT SELL triggered! Sold " + format16 + " of " + name9 + " at $" + format17 + ".\n");
                    z4 = true;
                }
                if (!z4) {
                    remainingCryptoOrders.add(cryptoOrder);
                }
            }
        }
        Iterable<Crypto> iterable4 = updatedCryptos;
        Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable4, 10));
        for (Crypto crypto3 : iterable4) {
            Crypto crypto4 = (Crypto) cryptosModifiedMap.get(crypto3.getId());
            if (crypto4 == null) {
                crypto4 = crypto3;
            }
            arrayList4.add(crypto4);
        }
        List finalCryptos = (List) arrayList4;
        double netCashDifference = currentWorkingCash - state.getCash();
        double addedCash = 0.0d + netCashDifference;
        return new MarketSimulationResult(finalStocks, finalCryptos, remainingStockOrders, remainingCryptoOrders, addedCash, addedSalary);
    }
}
