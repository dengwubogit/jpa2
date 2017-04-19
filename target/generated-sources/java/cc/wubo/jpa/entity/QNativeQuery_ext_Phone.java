package cc.wubo.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNativeQuery_ext_Phone is a Querydsl query type for NativeQuery_ext_Phone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNativeQuery_ext_Phone extends EntityPathBase<NativeQuery_ext_Phone> {

    private static final long serialVersionUID = -1612043777L;

    public static final QNativeQuery_ext_Phone nativeQuery_ext_Phone = new QNativeQuery_ext_Phone("nativeQuery_ext_Phone");

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public QNativeQuery_ext_Phone(String variable) {
        super(NativeQuery_ext_Phone.class, forVariable(variable));
    }

    public QNativeQuery_ext_Phone(Path<? extends NativeQuery_ext_Phone> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNativeQuery_ext_Phone(PathMetadata metadata) {
        super(NativeQuery_ext_Phone.class, metadata);
    }

}

