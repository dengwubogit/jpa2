package cc.wubo.jpa.entity.onetoone;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIdCard is a Querydsl query type for IdCard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIdCard extends EntityPathBase<IdCard> {

    private static final long serialVersionUID = 279465873L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIdCard idCard = new QIdCard("idCard");

    public final StringPath cardNum = createString("cardNum");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QPerson person;

    public QIdCard(String variable) {
        this(IdCard.class, forVariable(variable), INITS);
    }

    public QIdCard(Path<? extends IdCard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIdCard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIdCard(PathMetadata metadata, PathInits inits) {
        this(IdCard.class, metadata, inits);
    }

    public QIdCard(Class<? extends IdCard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.person = inits.isInitialized("person") ? new QPerson(forProperty("person"), inits.get("person")) : null;
    }

}

