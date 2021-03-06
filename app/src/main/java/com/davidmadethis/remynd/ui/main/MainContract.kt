package com.davidmadethis.remynd.ui.main

import ng.apk.instantemploy.ui.base.BasePresenter
import ng.apk.instantemploy.ui.base.BaseView


interface MainContract {

    interface View : BaseView<Presenter> {

        fun checkUserAccount()

    }

    interface Presenter : BasePresenter {

    }
}
