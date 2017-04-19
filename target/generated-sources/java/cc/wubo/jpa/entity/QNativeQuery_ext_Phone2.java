package cc.wubo.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNativeQuery_ext_Phone2 is a Querydsl query type for NativeQuery_ext_Phone2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNativeQuery_ext_Phone2 extends EntityPathBase<NativeQuery_ext_Phone2> {

    private static final long serialVersionUID = 1566250515L;

    public static final QNativeQuery_ext_Phone2 nativeQuery_ext_Phone2 = new QNativeQuery_ext_Phone2("nativeQuery_ext_Phone2");

    public final StringPath phone = createString("phone");

    public final StringPath username = createString("username");

    public QNativeQuery_ext_Phone2(String variable) {
        super(NativeQuery_ext_Phone2.class, forVariable(variable));
    }

    public QNativeQuery_ext_Phone2(Path<? extends NativeQuery_ext_Phone2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNativeQuery_ext_Phone2(PathMetadata metadata) {
        super(NativeQuery_ext_Phone2.class, metadata);
    }

}

