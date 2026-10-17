package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��C\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b«\u0001\b\u0087\b\u0018��2\u00020\u0001Bã\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\u0006\u0012\b\b\u0002\u0010(\u001a\u00020\u0006\u0012\b\b\u0002\u0010)\u001a\u00020\u0006\u0012\b\b\u0002\u0010*\u001a\u00020\u0006\u0012\b\b\u0002\u0010+\u001a\u00020\u0006\u0012\b\b\u0002\u0010,\u001a\u00020\u0006\u0012\b\b\u0002\u0010-\u001a\u00020\u0006\u0012\b\b\u0002\u0010.\u001a\u00020\u0006\u0012\b\b\u0002\u0010/\u001a\u00020\u0006\u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u00101\u001a\u00020\u0006\u0012\b\b\u0002\u00102\u001a\u00020\u0006\u0012\b\b\u0002\u00103\u001a\u00020\u0006\u0012\b\b\u0002\u00104\u001a\u00020\u0006\u0012\b\b\u0002\u00105\u001a\u00020\u0006\u0012\b\b\u0002\u00106\u001a\u00020\u0006\u0012\b\b\u0002\u00107\u001a\u00020\u0006\u0012\b\b\u0002\u00108\u001a\u00020\u0006\u0012\b\b\u0002\u00109\u001a\u00020\u0003\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\b\b\u0002\u0010;\u001a\u00020\u0003\u0012\b\b\u0002\u0010<\u001a\u00020\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0003\u0012\b\b\u0002\u0010>\u001a\u00020\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A\u0012\b\b\u0002\u0010C\u001a\u00020\u0006\u0012\b\b\u0002\u0010D\u001a\u00020\u0006\u0012\b\b\u0002\u0010E\u001a\u00020\u0006\u0012\b\b\u0002\u0010F\u001a\u00020\u0006\u0012\b\b\u0002\u0010G\u001a\u00020\u0006\u0012\b\b\u0002\u0010H\u001a\u00020\u0006\u0012\b\b\u0002\u0010I\u001a\u00020\u0006\u0012\b\b\u0002\u0010J\u001a\u00020\u0006\u0012\b\b\u0002\u0010K\u001a\u00020\u0006\u0012\b\b\u0002\u0010L\u001a\u00020\u0006\u0012\b\b\u0002\u0010M\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030A\u0012\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030A\u0012\b\b\u0002\u0010P\u001a\u00020\u0003\u0012\b\b\u0002\u0010Q\u001a\u00020\u000b¢\u0006\u0004\bR\u0010SJ\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010¦\u0001\u001a\u00020\rHÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010©\u0001\u001a\u00020\tHÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\rHÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0003HÆ\u0003J\u0010\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00020B0AHÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0006HÆ\u0003J\u0010\u0010ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030AHÆ\u0003J\u0010\u0010å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030AHÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u000bHÆ\u0003Jð\u0005\u0010è\u0001\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020\u00062\b\b\u0002\u00104\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020\u00062\b\b\u0002\u00106\u001a\u00020\u00062\b\b\u0002\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u00062\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\b\b\u0002\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u00062\b\b\u0002\u0010E\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020\u00062\b\b\u0002\u0010H\u001a\u00020\u00062\b\b\u0002\u0010I\u001a\u00020\u00062\b\b\u0002\u0010J\u001a\u00020\u00062\b\b\u0002\u0010K\u001a\u00020\u00062\b\b\u0002\u0010L\u001a\u00020\u00062\b\b\u0002\u0010M\u001a\u00020\u00062\u000e\b\u0002\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030A2\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030A2\b\b\u0002\u0010P\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u00020\u000bHÆ\u0001J\u0015\u0010é\u0001\u001a\u00020\u000b2\t\u0010ê\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ë\u0001\u001a\u00020\u0012HÖ\u0001J\n\u0010ì\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bT\u0010UR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bV\u0010UR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bW\u0010XR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bY\u0010XR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\bZ\u0010[R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\n\u0010\\R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b]\u0010^R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b_\u0010UR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b`\u0010XR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\ba\u0010[R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n��\u001a\u0004\bb\u0010cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bd\u0010UR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\be\u0010XR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bf\u0010XR\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bg\u0010XR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bh\u0010UR\u0011\u0010\u0018\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\bi\u0010^R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bj\u0010XR\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bk\u0010XR\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bl\u0010XR\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bm\u0010XR\u0011\u0010\u001d\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\\R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\bn\u0010UR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\bo\u0010UR\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bp\u0010UR\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bq\u0010XR\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\br\u0010XR\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bs\u0010XR\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bt\u0010XR\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bu\u0010XR\u0011\u0010&\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bv\u0010XR\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bw\u0010XR\u0011\u0010(\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bx\u0010XR\u0011\u0010)\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\by\u0010XR\u0011\u0010*\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\bz\u0010XR\u0011\u0010+\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b{\u0010XR\u0011\u0010,\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b|\u0010XR\u0011\u0010-\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b}\u0010XR\u0011\u0010.\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b~\u0010XR\u0011\u0010/\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u007f\u0010XR\u0012\u00100\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0080\u0001\u0010XR\u0012\u00101\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0081\u0001\u0010XR\u0012\u00102\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0082\u0001\u0010XR\u0012\u00103\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0083\u0001\u0010XR\u0012\u00104\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0084\u0001\u0010XR\u0012\u00105\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0085\u0001\u0010XR\u0012\u00106\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0086\u0001\u0010XR\u0012\u00107\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0087\u0001\u0010XR\u0012\u00108\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0088\u0001\u0010XR\u0012\u00109\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u0089\u0001\u0010UR\u0012\u0010:\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u008a\u0001\u0010UR\u0012\u0010;\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u008b\u0001\u0010UR\u0012\u0010<\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u008c\u0001\u0010UR\u0012\u0010=\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u008d\u0001\u0010UR\u0012\u0010>\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u008e\u0001\u0010UR\u0012\u0010?\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u008f\u0001\u0010UR\u0019\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A¢\u0006\n\n��\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0012\u0010C\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0092\u0001\u0010XR\u0012\u0010D\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0093\u0001\u0010XR\u0012\u0010E\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0094\u0001\u0010XR\u0012\u0010F\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0095\u0001\u0010XR\u0012\u0010G\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0096\u0001\u0010XR\u0012\u0010H\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0097\u0001\u0010XR\u0012\u0010I\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0098\u0001\u0010XR\u0012\u0010J\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u0099\u0001\u0010XR\u0012\u0010K\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u009a\u0001\u0010XR\u0012\u0010L\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u009b\u0001\u0010XR\u0012\u0010M\u001a\u00020\u0006¢\u0006\t\n��\u001a\u0005\b\u009c\u0001\u0010XR\u0019\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030A¢\u0006\n\n��\u001a\u0006\b\u009d\u0001\u0010\u0091\u0001R\u0019\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030A¢\u0006\n\n��\u001a\u0006\b\u009e\u0001\u0010\u0091\u0001R\u0012\u0010P\u001a\u00020\u0003¢\u0006\t\n��\u001a\u0005\b\u009f\u0001\u0010UR\u0011\u0010Q\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\bQ\u0010\\¨\u0006í\u0001"}, d2 = {"Lcom/example/data/NPCEntity;", "", "id", "", "name", "popularity", "", "influence", "fans", "", "isOnTour", "", "weeklySales", "", "bestSongTitle", "bestSongRating", "bestSongStreams", "age", "", "personality", "confidence", "creativity", "businessIntel", "genrePreference", "wealth", "stress", "mentalHealth", "happiness", "relationshipWithPlayer", "isRetired", "currentRecordLabel", "managerName", "careerGoal", "integrity", "generosity", "pride", "humility", "loyalty", "trust", "jealousy", "greed", "ego", "patience", "emotionalIntel", "discipline", "curiosity", "leadership", "wisdom", "compassion", "forgiveness", "gratitude", "courage", "stressTolerance", "riskTolerance", "workEthic", "adaptability", "selfAwareness", "strength", "weakness", "coreFear", "coreDream", "emotionalState", "communicationStyle", "decisionStyle", "memories", "", "Lcom/example/data/NPCMemory;", "professionalRespect", "personalTrust", "creativeRespect", "leadershipRespect", "competenceOpinion", "businessTrust", "financialTrust", "leadershipTrust", "confidentiality", "reliability", "publicReputation", "networks", "lifeEvents", "latestSelfReflection", "isFollowedByPlayer", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFJZDLjava/lang/String;FJILjava/lang/String;FFFLjava/lang/String;DFFFFZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFFFFFFFFFFFFFFFFFFFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFFFFFFFFFLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getPopularity", "()F", "getInfluence", "getFans", "()J", "()Z", "getWeeklySales", "()D", "getBestSongTitle", "getBestSongRating", "getBestSongStreams", "getAge", "()I", "getPersonality", "getConfidence", "getCreativity", "getBusinessIntel", "getGenrePreference", "getWealth", "getStress", "getMentalHealth", "getHappiness", "getRelationshipWithPlayer", "getCurrentRecordLabel", "getManagerName", "getCareerGoal", "getIntegrity", "getGenerosity", "getPride", "getHumility", "getLoyalty", "getTrust", "getJealousy", "getGreed", "getEgo", "getPatience", "getEmotionalIntel", "getDiscipline", "getCuriosity", "getLeadership", "getWisdom", "getCompassion", "getForgiveness", "getGratitude", "getCourage", "getStressTolerance", "getRiskTolerance", "getWorkEthic", "getAdaptability", "getSelfAwareness", "getStrength", "getWeakness", "getCoreFear", "getCoreDream", "getEmotionalState", "getCommunicationStyle", "getDecisionStyle", "getMemories", "()Ljava/util/List;", "getProfessionalRespect", "getPersonalTrust", "getCreativeRespect", "getLeadershipRespect", "getCompetenceOpinion", "getBusinessTrust", "getFinancialTrust", "getLeadershipTrust", "getConfidentiality", "getReliability", "getPublicReputation", "getNetworks", "getLifeEvents", "getLatestSelfReflection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: NPCEntity.class */
public final class NPCEntity {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    private final float popularity;
    private final float influence;
    private final long fans;
    private final boolean isOnTour;
    private final double weeklySales;
    @NotNull
    private final String bestSongTitle;
    private final float bestSongRating;
    private final long bestSongStreams;
    private final int age;
    @NotNull
    private final String personality;
    private final float confidence;
    private final float creativity;
    private final float businessIntel;
    @NotNull
    private final String genrePreference;
    private final double wealth;
    private final float stress;
    private final float mentalHealth;
    private final float happiness;
    private final float relationshipWithPlayer;
    private final boolean isRetired;
    @Nullable
    private final String currentRecordLabel;
    @Nullable
    private final String managerName;
    @NotNull
    private final String careerGoal;
    private final float integrity;
    private final float generosity;
    private final float pride;
    private final float humility;
    private final float loyalty;
    private final float trust;
    private final float jealousy;
    private final float greed;
    private final float ego;
    private final float patience;
    private final float emotionalIntel;
    private final float discipline;
    private final float curiosity;
    private final float leadership;
    private final float wisdom;
    private final float compassion;
    private final float forgiveness;
    private final float gratitude;
    private final float courage;
    private final float stressTolerance;
    private final float riskTolerance;
    private final float workEthic;
    private final float adaptability;
    private final float selfAwareness;
    @NotNull
    private final String strength;
    @NotNull
    private final String weakness;
    @NotNull
    private final String coreFear;
    @NotNull
    private final String coreDream;
    @NotNull
    private final String emotionalState;
    @NotNull
    private final String communicationStyle;
    @NotNull
    private final String decisionStyle;
    @NotNull
    private final List<NPCMemory> memories;
    private final float professionalRespect;
    private final float personalTrust;
    private final float creativeRespect;
    private final float leadershipRespect;
    private final float competenceOpinion;
    private final float businessTrust;
    private final float financialTrust;
    private final float leadershipTrust;
    private final float confidentiality;
    private final float reliability;
    private final float publicReputation;
    @NotNull
    private final List<String> networks;
    @NotNull
    private final List<String> lifeEvents;
    @NotNull
    private final String latestSelfReflection;
    private final boolean isFollowedByPlayer;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final float component3() {
        return this.popularity;
    }

    public final float component4() {
        return this.influence;
    }

    public final long component5() {
        return this.fans;
    }

    public final boolean component6() {
        return this.isOnTour;
    }

    public final double component7() {
        return this.weeklySales;
    }

    @NotNull
    public final String component8() {
        return this.bestSongTitle;
    }

    public final float component9() {
        return this.bestSongRating;
    }

    public final long component10() {
        return this.bestSongStreams;
    }

    public final int component11() {
        return this.age;
    }

    @NotNull
    public final String component12() {
        return this.personality;
    }

    public final float component13() {
        return this.confidence;
    }

    public final float component14() {
        return this.creativity;
    }

    public final float component15() {
        return this.businessIntel;
    }

    @NotNull
    public final String component16() {
        return this.genrePreference;
    }

    public final double component17() {
        return this.wealth;
    }

    public final float component18() {
        return this.stress;
    }

    public final float component19() {
        return this.mentalHealth;
    }

    public final float component20() {
        return this.happiness;
    }

    public final float component21() {
        return this.relationshipWithPlayer;
    }

    public final boolean component22() {
        return this.isRetired;
    }

    @Nullable
    public final String component23() {
        return this.currentRecordLabel;
    }

    @Nullable
    public final String component24() {
        return this.managerName;
    }

    @NotNull
    public final String component25() {
        return this.careerGoal;
    }

    public final float component26() {
        return this.integrity;
    }

    public final float component27() {
        return this.generosity;
    }

    public final float component28() {
        return this.pride;
    }

    public final float component29() {
        return this.humility;
    }

    public final float component30() {
        return this.loyalty;
    }

    public final float component31() {
        return this.trust;
    }

    public final float component32() {
        return this.jealousy;
    }

    public final float component33() {
        return this.greed;
    }

    public final float component34() {
        return this.ego;
    }

    public final float component35() {
        return this.patience;
    }

    public final float component36() {
        return this.emotionalIntel;
    }

    public final float component37() {
        return this.discipline;
    }

    public final float component38() {
        return this.curiosity;
    }

    public final float component39() {
        return this.leadership;
    }

    public final float component40() {
        return this.wisdom;
    }

    public final float component41() {
        return this.compassion;
    }

    public final float component42() {
        return this.forgiveness;
    }

    public final float component43() {
        return this.gratitude;
    }

    public final float component44() {
        return this.courage;
    }

    public final float component45() {
        return this.stressTolerance;
    }

    public final float component46() {
        return this.riskTolerance;
    }

    public final float component47() {
        return this.workEthic;
    }

    public final float component48() {
        return this.adaptability;
    }

    public final float component49() {
        return this.selfAwareness;
    }

    @NotNull
    public final String component50() {
        return this.strength;
    }

    @NotNull
    public final String component51() {
        return this.weakness;
    }

    @NotNull
    public final String component52() {
        return this.coreFear;
    }

    @NotNull
    public final String component53() {
        return this.coreDream;
    }

    @NotNull
    public final String component54() {
        return this.emotionalState;
    }

    @NotNull
    public final String component55() {
        return this.communicationStyle;
    }

    @NotNull
    public final String component56() {
        return this.decisionStyle;
    }

    @NotNull
    public final List<NPCMemory> component57() {
        return this.memories;
    }

    public final float component58() {
        return this.professionalRespect;
    }

    public final float component59() {
        return this.personalTrust;
    }

    public final float component60() {
        return this.creativeRespect;
    }

    public final float component61() {
        return this.leadershipRespect;
    }

    public final float component62() {
        return this.competenceOpinion;
    }

    public final float component63() {
        return this.businessTrust;
    }

    public final float component64() {
        return this.financialTrust;
    }

    public final float component65() {
        return this.leadershipTrust;
    }

    public final float component66() {
        return this.confidentiality;
    }

    public final float component67() {
        return this.reliability;
    }

    public final float component68() {
        return this.publicReputation;
    }

    @NotNull
    public final List<String> component69() {
        return this.networks;
    }

    @NotNull
    public final List<String> component70() {
        return this.lifeEvents;
    }

    @NotNull
    public final String component71() {
        return this.latestSelfReflection;
    }

    public final boolean component72() {
        return this.isFollowedByPlayer;
    }

    @NotNull
    public final NPCEntity copy(@NotNull String id, @NotNull String name, float popularity, float influence, long fans, boolean isOnTour, double weeklySales, @NotNull String bestSongTitle, float bestSongRating, long bestSongStreams, int age, @NotNull String personality, float confidence, float creativity, float businessIntel, @NotNull String genrePreference, double wealth, float stress, float mentalHealth, float happiness, float relationshipWithPlayer, boolean isRetired, @Nullable String currentRecordLabel, @Nullable String managerName, @NotNull String careerGoal, float integrity, float generosity, float pride, float humility, float loyalty, float trust, float jealousy, float greed, float ego, float patience, float emotionalIntel, float discipline, float curiosity, float leadership, float wisdom, float compassion, float forgiveness, float gratitude, float courage, float stressTolerance, float riskTolerance, float workEthic, float adaptability, float selfAwareness, @NotNull String strength, @NotNull String weakness, @NotNull String coreFear, @NotNull String coreDream, @NotNull String emotionalState, @NotNull String communicationStyle, @NotNull String decisionStyle, @NotNull List<NPCMemory> list, float professionalRespect, float personalTrust, float creativeRespect, float leadershipRespect, float competenceOpinion, float businessTrust, float financialTrust, float leadershipTrust, float confidentiality, float reliability, float publicReputation, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String latestSelfReflection, boolean isFollowedByPlayer) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bestSongTitle, "bestSongTitle");
        Intrinsics.checkNotNullParameter(personality, "personality");
        Intrinsics.checkNotNullParameter(genrePreference, "genrePreference");
        Intrinsics.checkNotNullParameter(careerGoal, "careerGoal");
        Intrinsics.checkNotNullParameter(strength, "strength");
        Intrinsics.checkNotNullParameter(weakness, "weakness");
        Intrinsics.checkNotNullParameter(coreFear, "coreFear");
        Intrinsics.checkNotNullParameter(coreDream, "coreDream");
        Intrinsics.checkNotNullParameter(emotionalState, "emotionalState");
        Intrinsics.checkNotNullParameter(communicationStyle, "communicationStyle");
        Intrinsics.checkNotNullParameter(decisionStyle, "decisionStyle");
        Intrinsics.checkNotNullParameter(list, "memories");
        Intrinsics.checkNotNullParameter(list2, "networks");
        Intrinsics.checkNotNullParameter(list3, "lifeEvents");
        Intrinsics.checkNotNullParameter(latestSelfReflection, "latestSelfReflection");
        return new NPCEntity(id, name, popularity, influence, fans, isOnTour, weeklySales, bestSongTitle, bestSongRating, bestSongStreams, age, personality, confidence, creativity, businessIntel, genrePreference, wealth, stress, mentalHealth, happiness, relationshipWithPlayer, isRetired, currentRecordLabel, managerName, careerGoal, integrity, generosity, pride, humility, loyalty, trust, jealousy, greed, ego, patience, emotionalIntel, discipline, curiosity, leadership, wisdom, compassion, forgiveness, gratitude, courage, stressTolerance, riskTolerance, workEthic, adaptability, selfAwareness, strength, weakness, coreFear, coreDream, emotionalState, communicationStyle, decisionStyle, list, professionalRespect, personalTrust, creativeRespect, leadershipRespect, competenceOpinion, businessTrust, financialTrust, leadershipTrust, confidentiality, reliability, publicReputation, list2, list3, latestSelfReflection, isFollowedByPlayer);
    }

    public static /* synthetic */ NPCEntity copy$default(NPCEntity nPCEntity, String str, String str2, float f, float f2, long j, boolean z, double d, String str3, float f3, long j2, int i, String str4, float f4, float f5, float f6, String str5, double d2, float f7, float f8, float f9, float f10, boolean z2, String str6, String str7, String str8, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, float f35, float f36, float f37, float f38, float f39, float f40, float f41, float f42, float f43, float f44, float f45, List list2, List list3, String str16, boolean z3, int i2, int i3, int i4, Object obj) {
        if ((i2 & 1) != 0) {
            str = nPCEntity.id;
        }
        if ((i2 & 2) != 0) {
            str2 = nPCEntity.name;
        }
        if ((i2 & 4) != 0) {
            f = nPCEntity.popularity;
        }
        if ((i2 & 8) != 0) {
            f2 = nPCEntity.influence;
        }
        if ((i2 & 16) != 0) {
            j = nPCEntity.fans;
        }
        if ((i2 & 32) != 0) {
            z = nPCEntity.isOnTour;
        }
        if ((i2 & 64) != 0) {
            d = nPCEntity.weeklySales;
        }
        if ((i2 & 128) != 0) {
            str3 = nPCEntity.bestSongTitle;
        }
        if ((i2 & 256) != 0) {
            f3 = nPCEntity.bestSongRating;
        }
        if ((i2 & 512) != 0) {
            j2 = nPCEntity.bestSongStreams;
        }
        if ((i2 & 1024) != 0) {
            i = nPCEntity.age;
        }
        if ((i2 & 2048) != 0) {
            str4 = nPCEntity.personality;
        }
        if ((i2 & 4096) != 0) {
            f4 = nPCEntity.confidence;
        }
        if ((i2 & 8192) != 0) {
            f5 = nPCEntity.creativity;
        }
        if ((i2 & 16384) != 0) {
            f6 = nPCEntity.businessIntel;
        }
        if ((i2 & 32768) != 0) {
            str5 = nPCEntity.genrePreference;
        }
        if ((i2 & 65536) != 0) {
            d2 = nPCEntity.wealth;
        }
        if ((i2 & 131072) != 0) {
            f7 = nPCEntity.stress;
        }
        if ((i2 & 262144) != 0) {
            f8 = nPCEntity.mentalHealth;
        }
        if ((i2 & 524288) != 0) {
            f9 = nPCEntity.happiness;
        }
        if ((i2 & 1048576) != 0) {
            f10 = nPCEntity.relationshipWithPlayer;
        }
        if ((i2 & 2097152) != 0) {
            z2 = nPCEntity.isRetired;
        }
        if ((i2 & 4194304) != 0) {
            str6 = nPCEntity.currentRecordLabel;
        }
        if ((i2 & 8388608) != 0) {
            str7 = nPCEntity.managerName;
        }
        if ((i2 & 16777216) != 0) {
            str8 = nPCEntity.careerGoal;
        }
        if ((i2 & 33554432) != 0) {
            f11 = nPCEntity.integrity;
        }
        if ((i2 & 67108864) != 0) {
            f12 = nPCEntity.generosity;
        }
        if ((i2 & 134217728) != 0) {
            f13 = nPCEntity.pride;
        }
        if ((i2 & 268435456) != 0) {
            f14 = nPCEntity.humility;
        }
        if ((i2 & 536870912) != 0) {
            f15 = nPCEntity.loyalty;
        }
        if ((i2 & 1073741824) != 0) {
            f16 = nPCEntity.trust;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            f17 = nPCEntity.jealousy;
        }
        if ((i3 & 1) != 0) {
            f18 = nPCEntity.greed;
        }
        if ((i3 & 2) != 0) {
            f19 = nPCEntity.ego;
        }
        if ((i3 & 4) != 0) {
            f20 = nPCEntity.patience;
        }
        if ((i3 & 8) != 0) {
            f21 = nPCEntity.emotionalIntel;
        }
        if ((i3 & 16) != 0) {
            f22 = nPCEntity.discipline;
        }
        if ((i3 & 32) != 0) {
            f23 = nPCEntity.curiosity;
        }
        if ((i3 & 64) != 0) {
            f24 = nPCEntity.leadership;
        }
        if ((i3 & 128) != 0) {
            f25 = nPCEntity.wisdom;
        }
        if ((i3 & 256) != 0) {
            f26 = nPCEntity.compassion;
        }
        if ((i3 & 512) != 0) {
            f27 = nPCEntity.forgiveness;
        }
        if ((i3 & 1024) != 0) {
            f28 = nPCEntity.gratitude;
        }
        if ((i3 & 2048) != 0) {
            f29 = nPCEntity.courage;
        }
        if ((i3 & 4096) != 0) {
            f30 = nPCEntity.stressTolerance;
        }
        if ((i3 & 8192) != 0) {
            f31 = nPCEntity.riskTolerance;
        }
        if ((i3 & 16384) != 0) {
            f32 = nPCEntity.workEthic;
        }
        if ((i3 & 32768) != 0) {
            f33 = nPCEntity.adaptability;
        }
        if ((i3 & 65536) != 0) {
            f34 = nPCEntity.selfAwareness;
        }
        if ((i3 & 131072) != 0) {
            str9 = nPCEntity.strength;
        }
        if ((i3 & 262144) != 0) {
            str10 = nPCEntity.weakness;
        }
        if ((i3 & 524288) != 0) {
            str11 = nPCEntity.coreFear;
        }
        if ((i3 & 1048576) != 0) {
            str12 = nPCEntity.coreDream;
        }
        if ((i3 & 2097152) != 0) {
            str13 = nPCEntity.emotionalState;
        }
        if ((i3 & 4194304) != 0) {
            str14 = nPCEntity.communicationStyle;
        }
        if ((i3 & 8388608) != 0) {
            str15 = nPCEntity.decisionStyle;
        }
        if ((i3 & 16777216) != 0) {
            list = nPCEntity.memories;
        }
        if ((i3 & 33554432) != 0) {
            f35 = nPCEntity.professionalRespect;
        }
        if ((i3 & 67108864) != 0) {
            f36 = nPCEntity.personalTrust;
        }
        if ((i3 & 134217728) != 0) {
            f37 = nPCEntity.creativeRespect;
        }
        if ((i3 & 268435456) != 0) {
            f38 = nPCEntity.leadershipRespect;
        }
        if ((i3 & 536870912) != 0) {
            f39 = nPCEntity.competenceOpinion;
        }
        if ((i3 & 1073741824) != 0) {
            f40 = nPCEntity.businessTrust;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            f41 = nPCEntity.financialTrust;
        }
        if ((i4 & 1) != 0) {
            f42 = nPCEntity.leadershipTrust;
        }
        if ((i4 & 2) != 0) {
            f43 = nPCEntity.confidentiality;
        }
        if ((i4 & 4) != 0) {
            f44 = nPCEntity.reliability;
        }
        if ((i4 & 8) != 0) {
            f45 = nPCEntity.publicReputation;
        }
        if ((i4 & 16) != 0) {
            list2 = nPCEntity.networks;
        }
        if ((i4 & 32) != 0) {
            list3 = nPCEntity.lifeEvents;
        }
        if ((i4 & 64) != 0) {
            str16 = nPCEntity.latestSelfReflection;
        }
        if ((i4 & 128) != 0) {
            z3 = nPCEntity.isFollowedByPlayer;
        }
        return nPCEntity.copy(str, str2, f, f2, j, z, d, str3, f3, j2, i, str4, f4, f5, f6, str5, d2, f7, f8, f9, f10, z2, str6, str7, str8, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, str9, str10, str11, str12, str13, str14, str15, list, f35, f36, f37, f38, f39, f40, f41, f42, f43, f44, f45, list2, list3, str16, z3);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        float f = this.popularity;
        float f2 = this.influence;
        long j = this.fans;
        boolean z = this.isOnTour;
        double d = this.weeklySales;
        String str3 = this.bestSongTitle;
        float f3 = this.bestSongRating;
        long j2 = this.bestSongStreams;
        int i = this.age;
        String str4 = this.personality;
        float f4 = this.confidence;
        float f5 = this.creativity;
        float f6 = this.businessIntel;
        String str5 = this.genrePreference;
        double d2 = this.wealth;
        float f7 = this.stress;
        float f8 = this.mentalHealth;
        float f9 = this.happiness;
        float f10 = this.relationshipWithPlayer;
        boolean z2 = this.isRetired;
        String str6 = this.currentRecordLabel;
        String str7 = this.managerName;
        String str8 = this.careerGoal;
        float f11 = this.integrity;
        float f12 = this.generosity;
        float f13 = this.pride;
        float f14 = this.humility;
        float f15 = this.loyalty;
        float f16 = this.trust;
        float f17 = this.jealousy;
        float f18 = this.greed;
        float f19 = this.ego;
        float f20 = this.patience;
        float f21 = this.emotionalIntel;
        float f22 = this.discipline;
        float f23 = this.curiosity;
        float f24 = this.leadership;
        float f25 = this.wisdom;
        float f26 = this.compassion;
        float f27 = this.forgiveness;
        float f28 = this.gratitude;
        float f29 = this.courage;
        float f30 = this.stressTolerance;
        float f31 = this.riskTolerance;
        float f32 = this.workEthic;
        float f33 = this.adaptability;
        float f34 = this.selfAwareness;
        String str9 = this.strength;
        String str10 = this.weakness;
        String str11 = this.coreFear;
        String str12 = this.coreDream;
        String str13 = this.emotionalState;
        String str14 = this.communicationStyle;
        String str15 = this.decisionStyle;
        List<NPCMemory> list = this.memories;
        float f35 = this.professionalRespect;
        float f36 = this.personalTrust;
        float f37 = this.creativeRespect;
        float f38 = this.leadershipRespect;
        float f39 = this.competenceOpinion;
        float f40 = this.businessTrust;
        float f41 = this.financialTrust;
        float f42 = this.leadershipTrust;
        float f43 = this.confidentiality;
        float f44 = this.reliability;
        float f45 = this.publicReputation;
        List<String> list2 = this.networks;
        List<String> list3 = this.lifeEvents;
        String str16 = this.latestSelfReflection;
        boolean z3 = this.isFollowedByPlayer;
        return "NPCEntity(id=" + str + ", name=" + str2 + ", popularity=" + f + ", influence=" + f2 + ", fans=" + j + ", isOnTour=" + str + ", weeklySales=" + z + ", bestSongTitle=" + d + ", bestSongRating=" + str + ", bestSongStreams=" + str3 + ", age=" + f3 + ", personality=" + j2 + ", confidence=" + str + ", creativity=" + i + ", businessIntel=" + str4 + ", genrePreference=" + f4 + ", wealth=" + f5 + ", stress=" + f6 + ", mentalHealth=" + str5 + ", happiness=" + d2 + ", relationshipWithPlayer=" + str + ", isRetired=" + f7 + ", currentRecordLabel=" + f8 + ", managerName=" + f9 + ", careerGoal=" + f10 + ", integrity=" + z2 + ", generosity=" + str6 + ", pride=" + str7 + ", humility=" + str8 + ", loyalty=" + f11 + ", trust=" + f12 + ", jealousy=" + f13 + ", greed=" + f14 + ", ego=" + f15 + ", patience=" + f16 + ", emotionalIntel=" + f17 + ", discipline=" + f18 + ", curiosity=" + f19 + ", leadership=" + f20 + ", wisdom=" + f21 + ", compassion=" + f22 + ", forgiveness=" + f23 + ", gratitude=" + f24 + ", courage=" + f25 + ", stressTolerance=" + f26 + ", riskTolerance=" + f27 + ", workEthic=" + f28 + ", adaptability=" + f29 + ", selfAwareness=" + f30 + ", strength=" + f31 + ", weakness=" + f32 + ", coreFear=" + f33 + ", coreDream=" + f34 + ", emotionalState=" + str9 + ", communicationStyle=" + str10 + ", decisionStyle=" + str11 + ", memories=" + str12 + ", professionalRespect=" + str13 + ", personalTrust=" + str14 + ", creativeRespect=" + str15 + ", leadershipRespect=" + list + ", competenceOpinion=" + f35 + ", businessTrust=" + f36 + ", financialTrust=" + f37 + ", leadershipTrust=" + f38 + ", confidentiality=" + f39 + ", reliability=" + f40 + ", publicReputation=" + f41 + ", networks=" + f42 + ", lifeEvents=" + f43 + ", latestSelfReflection=" + f44 + ", isFollowedByPlayer=" + f45 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((result * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.popularity)) * 31) + Float.hashCode(this.influence)) * 31) + Long.hashCode(this.fans)) * 31) + Boolean.hashCode(this.isOnTour)) * 31) + Double.hashCode(this.weeklySales)) * 31) + this.bestSongTitle.hashCode()) * 31) + Float.hashCode(this.bestSongRating)) * 31) + Long.hashCode(this.bestSongStreams)) * 31) + Integer.hashCode(this.age)) * 31) + this.personality.hashCode()) * 31) + Float.hashCode(this.confidence)) * 31) + Float.hashCode(this.creativity)) * 31) + Float.hashCode(this.businessIntel)) * 31) + this.genrePreference.hashCode()) * 31) + Double.hashCode(this.wealth)) * 31) + Float.hashCode(this.stress)) * 31) + Float.hashCode(this.mentalHealth)) * 31) + Float.hashCode(this.happiness)) * 31) + Float.hashCode(this.relationshipWithPlayer)) * 31) + Boolean.hashCode(this.isRetired)) * 31) + (this.currentRecordLabel == null ? 0 : this.currentRecordLabel.hashCode())) * 31) + (this.managerName == null ? 0 : this.managerName.hashCode())) * 31) + this.careerGoal.hashCode()) * 31) + Float.hashCode(this.integrity)) * 31) + Float.hashCode(this.generosity)) * 31) + Float.hashCode(this.pride)) * 31) + Float.hashCode(this.humility)) * 31) + Float.hashCode(this.loyalty)) * 31) + Float.hashCode(this.trust)) * 31) + Float.hashCode(this.jealousy)) * 31) + Float.hashCode(this.greed)) * 31) + Float.hashCode(this.ego)) * 31) + Float.hashCode(this.patience)) * 31) + Float.hashCode(this.emotionalIntel)) * 31) + Float.hashCode(this.discipline)) * 31) + Float.hashCode(this.curiosity)) * 31) + Float.hashCode(this.leadership)) * 31) + Float.hashCode(this.wisdom)) * 31) + Float.hashCode(this.compassion)) * 31) + Float.hashCode(this.forgiveness)) * 31) + Float.hashCode(this.gratitude)) * 31) + Float.hashCode(this.courage)) * 31) + Float.hashCode(this.stressTolerance)) * 31) + Float.hashCode(this.riskTolerance)) * 31) + Float.hashCode(this.workEthic)) * 31) + Float.hashCode(this.adaptability)) * 31) + Float.hashCode(this.selfAwareness)) * 31) + this.strength.hashCode()) * 31) + this.weakness.hashCode()) * 31) + this.coreFear.hashCode()) * 31) + this.coreDream.hashCode()) * 31) + this.emotionalState.hashCode()) * 31) + this.communicationStyle.hashCode()) * 31) + this.decisionStyle.hashCode()) * 31) + this.memories.hashCode()) * 31) + Float.hashCode(this.professionalRespect)) * 31) + Float.hashCode(this.personalTrust)) * 31) + Float.hashCode(this.creativeRespect)) * 31) + Float.hashCode(this.leadershipRespect)) * 31) + Float.hashCode(this.competenceOpinion)) * 31) + Float.hashCode(this.businessTrust)) * 31) + Float.hashCode(this.financialTrust)) * 31) + Float.hashCode(this.leadershipTrust)) * 31) + Float.hashCode(this.confidentiality)) * 31) + Float.hashCode(this.reliability)) * 31) + Float.hashCode(this.publicReputation)) * 31) + this.networks.hashCode()) * 31) + this.lifeEvents.hashCode()) * 31) + this.latestSelfReflection.hashCode()) * 31) + Boolean.hashCode(this.isFollowedByPlayer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof NPCEntity) {
            NPCEntity nPCEntity = (NPCEntity) other;
            return Intrinsics.areEqual(this.id, nPCEntity.id) && Intrinsics.areEqual(this.name, nPCEntity.name) && Float.compare(this.popularity, nPCEntity.popularity) == 0 && Float.compare(this.influence, nPCEntity.influence) == 0 && this.fans == nPCEntity.fans && this.isOnTour == nPCEntity.isOnTour && Double.compare(this.weeklySales, nPCEntity.weeklySales) == 0 && Intrinsics.areEqual(this.bestSongTitle, nPCEntity.bestSongTitle) && Float.compare(this.bestSongRating, nPCEntity.bestSongRating) == 0 && this.bestSongStreams == nPCEntity.bestSongStreams && this.age == nPCEntity.age && Intrinsics.areEqual(this.personality, nPCEntity.personality) && Float.compare(this.confidence, nPCEntity.confidence) == 0 && Float.compare(this.creativity, nPCEntity.creativity) == 0 && Float.compare(this.businessIntel, nPCEntity.businessIntel) == 0 && Intrinsics.areEqual(this.genrePreference, nPCEntity.genrePreference) && Double.compare(this.wealth, nPCEntity.wealth) == 0 && Float.compare(this.stress, nPCEntity.stress) == 0 && Float.compare(this.mentalHealth, nPCEntity.mentalHealth) == 0 && Float.compare(this.happiness, nPCEntity.happiness) == 0 && Float.compare(this.relationshipWithPlayer, nPCEntity.relationshipWithPlayer) == 0 && this.isRetired == nPCEntity.isRetired && Intrinsics.areEqual(this.currentRecordLabel, nPCEntity.currentRecordLabel) && Intrinsics.areEqual(this.managerName, nPCEntity.managerName) && Intrinsics.areEqual(this.careerGoal, nPCEntity.careerGoal) && Float.compare(this.integrity, nPCEntity.integrity) == 0 && Float.compare(this.generosity, nPCEntity.generosity) == 0 && Float.compare(this.pride, nPCEntity.pride) == 0 && Float.compare(this.humility, nPCEntity.humility) == 0 && Float.compare(this.loyalty, nPCEntity.loyalty) == 0 && Float.compare(this.trust, nPCEntity.trust) == 0 && Float.compare(this.jealousy, nPCEntity.jealousy) == 0 && Float.compare(this.greed, nPCEntity.greed) == 0 && Float.compare(this.ego, nPCEntity.ego) == 0 && Float.compare(this.patience, nPCEntity.patience) == 0 && Float.compare(this.emotionalIntel, nPCEntity.emotionalIntel) == 0 && Float.compare(this.discipline, nPCEntity.discipline) == 0 && Float.compare(this.curiosity, nPCEntity.curiosity) == 0 && Float.compare(this.leadership, nPCEntity.leadership) == 0 && Float.compare(this.wisdom, nPCEntity.wisdom) == 0 && Float.compare(this.compassion, nPCEntity.compassion) == 0 && Float.compare(this.forgiveness, nPCEntity.forgiveness) == 0 && Float.compare(this.gratitude, nPCEntity.gratitude) == 0 && Float.compare(this.courage, nPCEntity.courage) == 0 && Float.compare(this.stressTolerance, nPCEntity.stressTolerance) == 0 && Float.compare(this.riskTolerance, nPCEntity.riskTolerance) == 0 && Float.compare(this.workEthic, nPCEntity.workEthic) == 0 && Float.compare(this.adaptability, nPCEntity.adaptability) == 0 && Float.compare(this.selfAwareness, nPCEntity.selfAwareness) == 0 && Intrinsics.areEqual(this.strength, nPCEntity.strength) && Intrinsics.areEqual(this.weakness, nPCEntity.weakness) && Intrinsics.areEqual(this.coreFear, nPCEntity.coreFear) && Intrinsics.areEqual(this.coreDream, nPCEntity.coreDream) && Intrinsics.areEqual(this.emotionalState, nPCEntity.emotionalState) && Intrinsics.areEqual(this.communicationStyle, nPCEntity.communicationStyle) && Intrinsics.areEqual(this.decisionStyle, nPCEntity.decisionStyle) && Intrinsics.areEqual(this.memories, nPCEntity.memories) && Float.compare(this.professionalRespect, nPCEntity.professionalRespect) == 0 && Float.compare(this.personalTrust, nPCEntity.personalTrust) == 0 && Float.compare(this.creativeRespect, nPCEntity.creativeRespect) == 0 && Float.compare(this.leadershipRespect, nPCEntity.leadershipRespect) == 0 && Float.compare(this.competenceOpinion, nPCEntity.competenceOpinion) == 0 && Float.compare(this.businessTrust, nPCEntity.businessTrust) == 0 && Float.compare(this.financialTrust, nPCEntity.financialTrust) == 0 && Float.compare(this.leadershipTrust, nPCEntity.leadershipTrust) == 0 && Float.compare(this.confidentiality, nPCEntity.confidentiality) == 0 && Float.compare(this.reliability, nPCEntity.reliability) == 0 && Float.compare(this.publicReputation, nPCEntity.publicReputation) == 0 && Intrinsics.areEqual(this.networks, nPCEntity.networks) && Intrinsics.areEqual(this.lifeEvents, nPCEntity.lifeEvents) && Intrinsics.areEqual(this.latestSelfReflection, nPCEntity.latestSelfReflection) && this.isFollowedByPlayer == nPCEntity.isFollowedByPlayer;
        }
        return false;
    }

    public NPCEntity(@NotNull String id, @NotNull String name, float popularity, float influence, long fans, boolean isOnTour, double weeklySales, @NotNull String bestSongTitle, float bestSongRating, long bestSongStreams, int age, @NotNull String personality, float confidence, float creativity, float businessIntel, @NotNull String genrePreference, double wealth, float stress, float mentalHealth, float happiness, float relationshipWithPlayer, boolean isRetired, @Nullable String currentRecordLabel, @Nullable String managerName, @NotNull String careerGoal, float integrity, float generosity, float pride, float humility, float loyalty, float trust, float jealousy, float greed, float ego, float patience, float emotionalIntel, float discipline, float curiosity, float leadership, float wisdom, float compassion, float forgiveness, float gratitude, float courage, float stressTolerance, float riskTolerance, float workEthic, float adaptability, float selfAwareness, @NotNull String strength, @NotNull String weakness, @NotNull String coreFear, @NotNull String coreDream, @NotNull String emotionalState, @NotNull String communicationStyle, @NotNull String decisionStyle, @NotNull List<NPCMemory> list, float professionalRespect, float personalTrust, float creativeRespect, float leadershipRespect, float competenceOpinion, float businessTrust, float financialTrust, float leadershipTrust, float confidentiality, float reliability, float publicReputation, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull String latestSelfReflection, boolean isFollowedByPlayer) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bestSongTitle, "bestSongTitle");
        Intrinsics.checkNotNullParameter(personality, "personality");
        Intrinsics.checkNotNullParameter(genrePreference, "genrePreference");
        Intrinsics.checkNotNullParameter(careerGoal, "careerGoal");
        Intrinsics.checkNotNullParameter(strength, "strength");
        Intrinsics.checkNotNullParameter(weakness, "weakness");
        Intrinsics.checkNotNullParameter(coreFear, "coreFear");
        Intrinsics.checkNotNullParameter(coreDream, "coreDream");
        Intrinsics.checkNotNullParameter(emotionalState, "emotionalState");
        Intrinsics.checkNotNullParameter(communicationStyle, "communicationStyle");
        Intrinsics.checkNotNullParameter(decisionStyle, "decisionStyle");
        Intrinsics.checkNotNullParameter(list, "memories");
        Intrinsics.checkNotNullParameter(list2, "networks");
        Intrinsics.checkNotNullParameter(list3, "lifeEvents");
        Intrinsics.checkNotNullParameter(latestSelfReflection, "latestSelfReflection");
        this.id = id;
        this.name = name;
        this.popularity = popularity;
        this.influence = influence;
        this.fans = fans;
        this.isOnTour = isOnTour;
        this.weeklySales = weeklySales;
        this.bestSongTitle = bestSongTitle;
        this.bestSongRating = bestSongRating;
        this.bestSongStreams = bestSongStreams;
        this.age = age;
        this.personality = personality;
        this.confidence = confidence;
        this.creativity = creativity;
        this.businessIntel = businessIntel;
        this.genrePreference = genrePreference;
        this.wealth = wealth;
        this.stress = stress;
        this.mentalHealth = mentalHealth;
        this.happiness = happiness;
        this.relationshipWithPlayer = relationshipWithPlayer;
        this.isRetired = isRetired;
        this.currentRecordLabel = currentRecordLabel;
        this.managerName = managerName;
        this.careerGoal = careerGoal;
        this.integrity = integrity;
        this.generosity = generosity;
        this.pride = pride;
        this.humility = humility;
        this.loyalty = loyalty;
        this.trust = trust;
        this.jealousy = jealousy;
        this.greed = greed;
        this.ego = ego;
        this.patience = patience;
        this.emotionalIntel = emotionalIntel;
        this.discipline = discipline;
        this.curiosity = curiosity;
        this.leadership = leadership;
        this.wisdom = wisdom;
        this.compassion = compassion;
        this.forgiveness = forgiveness;
        this.gratitude = gratitude;
        this.courage = courage;
        this.stressTolerance = stressTolerance;
        this.riskTolerance = riskTolerance;
        this.workEthic = workEthic;
        this.adaptability = adaptability;
        this.selfAwareness = selfAwareness;
        this.strength = strength;
        this.weakness = weakness;
        this.coreFear = coreFear;
        this.coreDream = coreDream;
        this.emotionalState = emotionalState;
        this.communicationStyle = communicationStyle;
        this.decisionStyle = decisionStyle;
        this.memories = list;
        this.professionalRespect = professionalRespect;
        this.personalTrust = personalTrust;
        this.creativeRespect = creativeRespect;
        this.leadershipRespect = leadershipRespect;
        this.competenceOpinion = competenceOpinion;
        this.businessTrust = businessTrust;
        this.financialTrust = financialTrust;
        this.leadershipTrust = leadershipTrust;
        this.confidentiality = confidentiality;
        this.reliability = reliability;
        this.publicReputation = publicReputation;
        this.networks = list2;
        this.lifeEvents = list3;
        this.latestSelfReflection = latestSelfReflection;
        this.isFollowedByPlayer = isFollowedByPlayer;
    }

    public /* synthetic */ NPCEntity(String str, String str2, float f, float f2, long j, boolean z, double d, String str3, float f3, long j2, int i, String str4, float f4, float f5, float f6, String str5, double d2, float f7, float f8, float f9, float f10, boolean z2, String str6, String str7, String str8, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, float f35, float f36, float f37, float f38, float f39, float f40, float f41, float f42, float f43, float f44, float f45, List list2, List list3, String str16, boolean z3, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, f2, j, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 0.0d : d, (i2 & 128) != 0 ? "Unknown" : str3, (i2 & 256) != 0 ? 3.0f : f3, (i2 & 512) != 0 ? 0L : j2, (i2 & 1024) != 0 ? 23 : i, (i2 & 2048) != 0 ? "Charismatic" : str4, (i2 & 4096) != 0 ? 75.0f : f4, (i2 & 8192) != 0 ? 70.0f : f5, (i2 & 16384) != 0 ? 60.0f : f6, (i2 & 32768) != 0 ? "Pop" : str5, (i2 & 65536) != 0 ? 35000.0d : d2, (i2 & 131072) != 0 ? 25.0f : f7, (i2 & 262144) != 0 ? 85.0f : f8, (i2 & 524288) != 0 ? 80.0f : f9, (i2 & 1048576) != 0 ? 50.0f : f10, (i2 & 2097152) != 0 ? false : z2, (i2 & 4194304) != 0 ? "Independent" : str6, (i2 & 8388608) != 0 ? "None" : str7, (i2 & 16777216) != 0 ? "Superstardom" : str8, (i2 & 33554432) != 0 ? 50.0f : f11, (i2 & 67108864) != 0 ? 50.0f : f12, (i2 & 134217728) != 0 ? 50.0f : f13, (i2 & 268435456) != 0 ? 50.0f : f14, (i2 & 536870912) != 0 ? 50.0f : f15, (i2 & 1073741824) != 0 ? 50.0f : f16, (i2 & Integer.MIN_VALUE) != 0 ? 30.0f : f17, (i3 & 1) != 0 ? 40.0f : f18, (i3 & 2) != 0 ? 50.0f : f19, (i3 & 4) != 0 ? 50.0f : f20, (i3 & 8) != 0 ? 50.0f : f21, (i3 & 16) != 0 ? 50.0f : f22, (i3 & 32) != 0 ? 50.0f : f23, (i3 & 64) != 0 ? 50.0f : f24, (i3 & 128) != 0 ? 50.0f : f25, (i3 & 256) != 0 ? 50.0f : f26, (i3 & 512) != 0 ? 50.0f : f27, (i3 & 1024) != 0 ? 50.0f : f28, (i3 & 2048) != 0 ? 50.0f : f29, (i3 & 4096) != 0 ? 50.0f : f30, (i3 & 8192) != 0 ? 50.0f : f31, (i3 & 16384) != 0 ? 50.0f : f32, (i3 & 32768) != 0 ? 50.0f : f33, (i3 & 65536) != 0 ? 50.0f : f34, (i3 & 131072) != 0 ? "Highly Creative" : str9, (i3 & 262144) != 0 ? "Egoistic" : str10, (i3 & 524288) != 0 ? "Obscurity" : str11, (i3 & 1048576) != 0 ? "Grammy Achievement" : str12, (i3 & 2097152) != 0 ? "Calm" : str13, (i3 & 4194304) != 0 ? "Diplomatic" : str14, (i3 & 8388608) != 0 ? "Balanced" : str15, (i3 & 16777216) != 0 ? CollectionsKt.emptyList() : list, (i3 & 33554432) != 0 ? 50.0f : f35, (i3 & 67108864) != 0 ? 50.0f : f36, (i3 & 134217728) != 0 ? 50.0f : f37, (i3 & 268435456) != 0 ? 50.0f : f38, (i3 & 536870912) != 0 ? 50.0f : f39, (i3 & 1073741824) != 0 ? 50.0f : f40, (i3 & Integer.MIN_VALUE) != 0 ? 50.0f : f41, (i4 & 1) != 0 ? 50.0f : f42, (i4 & 2) != 0 ? 50.0f : f43, (i4 & 4) != 0 ? 50.0f : f44, (i4 & 8) != 0 ? 50.0f : f45, (i4 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i4 & 32) != 0 ? CollectionsKt.emptyList() : list3, (i4 & 64) != 0 ? "" : str16, (i4 & 128) != 0 ? false : z3);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getPopularity() {
        return this.popularity;
    }

    public final float getInfluence() {
        return this.influence;
    }

    public final long getFans() {
        return this.fans;
    }

    public final boolean isOnTour() {
        return this.isOnTour;
    }

    public final double getWeeklySales() {
        return this.weeklySales;
    }

    @NotNull
    public final String getBestSongTitle() {
        return this.bestSongTitle;
    }

    public final float getBestSongRating() {
        return this.bestSongRating;
    }

    public final long getBestSongStreams() {
        return this.bestSongStreams;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final String getPersonality() {
        return this.personality;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final float getCreativity() {
        return this.creativity;
    }

    public final float getBusinessIntel() {
        return this.businessIntel;
    }

    @NotNull
    public final String getGenrePreference() {
        return this.genrePreference;
    }

    public final double getWealth() {
        return this.wealth;
    }

    public final float getStress() {
        return this.stress;
    }

    public final float getMentalHealth() {
        return this.mentalHealth;
    }

    public final float getHappiness() {
        return this.happiness;
    }

    public final float getRelationshipWithPlayer() {
        return this.relationshipWithPlayer;
    }

    public final boolean isRetired() {
        return this.isRetired;
    }

    @Nullable
    public final String getCurrentRecordLabel() {
        return this.currentRecordLabel;
    }

    @Nullable
    public final String getManagerName() {
        return this.managerName;
    }

    @NotNull
    public final String getCareerGoal() {
        return this.careerGoal;
    }

    public final float getIntegrity() {
        return this.integrity;
    }

    public final float getGenerosity() {
        return this.generosity;
    }

    public final float getPride() {
        return this.pride;
    }

    public final float getHumility() {
        return this.humility;
    }

    public final float getLoyalty() {
        return this.loyalty;
    }

    public final float getTrust() {
        return this.trust;
    }

    public final float getJealousy() {
        return this.jealousy;
    }

    public final float getGreed() {
        return this.greed;
    }

    public final float getEgo() {
        return this.ego;
    }

    public final float getPatience() {
        return this.patience;
    }

    public final float getEmotionalIntel() {
        return this.emotionalIntel;
    }

    public final float getDiscipline() {
        return this.discipline;
    }

    public final float getCuriosity() {
        return this.curiosity;
    }

    public final float getLeadership() {
        return this.leadership;
    }

    public final float getWisdom() {
        return this.wisdom;
    }

    public final float getCompassion() {
        return this.compassion;
    }

    public final float getForgiveness() {
        return this.forgiveness;
    }

    public final float getGratitude() {
        return this.gratitude;
    }

    public final float getCourage() {
        return this.courage;
    }

    public final float getStressTolerance() {
        return this.stressTolerance;
    }

    public final float getRiskTolerance() {
        return this.riskTolerance;
    }

    public final float getWorkEthic() {
        return this.workEthic;
    }

    public final float getAdaptability() {
        return this.adaptability;
    }

    public final float getSelfAwareness() {
        return this.selfAwareness;
    }

    @NotNull
    public final String getStrength() {
        return this.strength;
    }

    @NotNull
    public final String getWeakness() {
        return this.weakness;
    }

    @NotNull
    public final String getCoreFear() {
        return this.coreFear;
    }

    @NotNull
    public final String getCoreDream() {
        return this.coreDream;
    }

    @NotNull
    public final String getEmotionalState() {
        return this.emotionalState;
    }

    @NotNull
    public final String getCommunicationStyle() {
        return this.communicationStyle;
    }

    @NotNull
    public final String getDecisionStyle() {
        return this.decisionStyle;
    }

    @NotNull
    public final List<NPCMemory> getMemories() {
        return this.memories;
    }

    public final float getProfessionalRespect() {
        return this.professionalRespect;
    }

    public final float getPersonalTrust() {
        return this.personalTrust;
    }

    public final float getCreativeRespect() {
        return this.creativeRespect;
    }

    public final float getLeadershipRespect() {
        return this.leadershipRespect;
    }

    public final float getCompetenceOpinion() {
        return this.competenceOpinion;
    }

    public final float getBusinessTrust() {
        return this.businessTrust;
    }

    public final float getFinancialTrust() {
        return this.financialTrust;
    }

    public final float getLeadershipTrust() {
        return this.leadershipTrust;
    }

    public final float getConfidentiality() {
        return this.confidentiality;
    }

    public final float getReliability() {
        return this.reliability;
    }

    public final float getPublicReputation() {
        return this.publicReputation;
    }

    @NotNull
    public final List<String> getNetworks() {
        return this.networks;
    }

    @NotNull
    public final List<String> getLifeEvents() {
        return this.lifeEvents;
    }

    @NotNull
    public final String getLatestSelfReflection() {
        return this.latestSelfReflection;
    }

    public final boolean isFollowedByPlayer() {
        return this.isFollowedByPlayer;
    }
}
