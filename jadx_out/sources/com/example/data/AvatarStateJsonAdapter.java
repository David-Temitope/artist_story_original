package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AvatarStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/AvatarStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/AvatarState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "listOfStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: AvatarStateJsonAdapter.class */
public final class AvatarStateJsonAdapter extends JsonAdapter<AvatarState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @Nullable
    private volatile Constructor<AvatarState> constructorRef;
    public static final int $stable = 8;

    public AvatarStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"avatarBaseLook", "avatarSkinTone", "avatarHairStyleId", "avatarClothingId", "avatarJewelryId", "avatarOwnedItemIds"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "avatarBaseLook");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<List<String>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "avatarOwnedItemIds");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.listOfStringAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("AvatarState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public AvatarState m20fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String avatarBaseLook = null;
        String avatarSkinTone = null;
        String avatarHairStyleId = null;
        String avatarClothingId = null;
        String avatarJewelryId = null;
        List avatarOwnedItemIds = null;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        avatarBaseLook = str;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("avatarBaseLook", "avatarBaseLook", reader);
                    }
                case 1:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        avatarSkinTone = str2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("avatarSkinTone", "avatarSkinTone", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        avatarHairStyleId = str3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("avatarHairStyleId", "avatarHairStyleId", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        avatarClothingId = str4;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("avatarClothingId", "avatarClothingId", reader);
                    }
                case 4:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        avatarJewelryId = str5;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("avatarJewelryId", "avatarJewelryId", reader);
                    }
                case 5:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        avatarOwnedItemIds = list;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("avatarOwnedItemIds", "avatarOwnedItemIds", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 != -64) {
            Constructor constructor = this.constructorRef;
            if (constructor == null) {
                Constructor declaredConstructor = AvatarState.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.constructorRef = declaredConstructor;
                constructor = declaredConstructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor localConstructor = constructor;
            AvatarState newInstance = localConstructor.newInstance(avatarBaseLook, avatarSkinTone, avatarHairStyleId, avatarClothingId, avatarJewelryId, avatarOwnedItemIds, Integer.valueOf(mask0), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        String str6 = avatarBaseLook;
        Intrinsics.checkNotNull(str6, "null cannot be cast to non-null type kotlin.String");
        String str7 = avatarSkinTone;
        Intrinsics.checkNotNull(str7, "null cannot be cast to non-null type kotlin.String");
        String str8 = avatarHairStyleId;
        Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
        String str9 = avatarClothingId;
        Intrinsics.checkNotNull(str9, "null cannot be cast to non-null type kotlin.String");
        String str10 = avatarJewelryId;
        Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
        List list2 = avatarOwnedItemIds;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return new AvatarState(str6, str7, str8, str9, str10, list2);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable AvatarState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("avatarBaseLook");
        this.stringAdapter.toJson(writer, value_.getAvatarBaseLook());
        writer.name("avatarSkinTone");
        this.stringAdapter.toJson(writer, value_.getAvatarSkinTone());
        writer.name("avatarHairStyleId");
        this.stringAdapter.toJson(writer, value_.getAvatarHairStyleId());
        writer.name("avatarClothingId");
        this.stringAdapter.toJson(writer, value_.getAvatarClothingId());
        writer.name("avatarJewelryId");
        this.stringAdapter.toJson(writer, value_.getAvatarJewelryId());
        writer.name("avatarOwnedItemIds");
        this.listOfStringAdapter.toJson(writer, value_.getAvatarOwnedItemIds());
        writer.endObject();
    }
}
