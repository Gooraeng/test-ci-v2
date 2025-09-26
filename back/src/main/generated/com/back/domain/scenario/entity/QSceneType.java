package com.back.domain.scenario.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSceneType is a Querydsl query type for SceneType
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSceneType extends EntityPathBase<SceneType> {

    private static final long serialVersionUID = -53255959L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSceneType sceneType = new QSceneType("sceneType");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final StringPath analysis = createString("analysis");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final QScenario scenario;

    public final EnumPath<Type> type = createEnum("type", Type.class);

    public QSceneType(String variable) {
        this(SceneType.class, forVariable(variable), INITS);
    }

    public QSceneType(Path<? extends SceneType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSceneType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSceneType(PathMetadata metadata, PathInits inits) {
        this(SceneType.class, metadata, inits);
    }

    public QSceneType(Class<? extends SceneType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.scenario = inits.isInitialized("scenario") ? new QScenario(forProperty("scenario"), inits.get("scenario")) : null;
    }

}

