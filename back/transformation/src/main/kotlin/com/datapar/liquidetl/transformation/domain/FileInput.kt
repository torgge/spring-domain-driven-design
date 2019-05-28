package com.datapar.liquidetl.transformation.domain

import com.datapar.liquidetl.transformation.shared.Situation
import java.util.*


class FileInput(
        uuid: String = UUID.randomUUID().toString(),
        createDate: Date,
        situation: Situation
)