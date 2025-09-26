package com.back.domain.scenario.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSceneCompare is a Querydsl query type for SceneCompare
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSceneCompare extends EntityPathBase<SceneCompare> {

    private static final long serialVersionUID = 98326742L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSceneCompare sceneCompare = new QSceneCompare("sceneCompare");

    public final com.back.global.baseentity.QBaseEntity _super = new com.back.global.baseentity.QBaseEntity(this);

    public final StringPath compareResult = createString("compareResult");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final EnumPath<SceneCompareResultType> resultType = createEnum("resultType", SceneCompareResultType.class);

    public final QScenario scenario;

    public QSceneCompare(String variable) {
        this(SceneCompare.class, forVariable(variable), INITS);
    }

    public QSceneCompare(Path<? extends SceneCompare> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSceneCompare(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSceneCompare(PathMetadata metadata, PathInits inits) {
        this(SceneCompare.class, metadata, inits);
    }

    public QSceneCompare(Class<? extends SceneCompare> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.scenario = inits.isInitialized("scenario") ? new QScenario(forProperty("scenario"), inits.get("scenario")) : null;
    }

}

