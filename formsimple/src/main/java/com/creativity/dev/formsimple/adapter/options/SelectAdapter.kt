package com.creativity.dev.formsimple.adapter.options

import android.content.Context
import android.content.res.AssetManager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.marginBottom
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import com.creativity.dev.formsimple.BuilderForms
import com.creativity.dev.formsimple.R

import com.creativity.dev.formsimple.extensions.eventImageCheckBoxSelect
import com.creativity.dev.formsimple.interfaces.EventList
import com.creativity.dev.formsimple.interfaces.EventListDynamic
import com.creativity.dev.formsimple.model.Select

class SelectAdapter (): RecyclerView.Adapter<SelectAdapter.MyViewHolder>() {

    lateinit var list: List<Select>

    lateinit var asset: AssetManager

    lateinit var mContext: Context

    private var imagePositive: Int = R.drawable.check_2

    private var imageNegative: Int = R.drawable.stop

    private var imageCheck: Int = R.drawable.stop

    private var isSingleSelection: Boolean = false

    private var backgroundRounded: Int = R.drawable.background_light_rounded

    private var backgroundTop: Int = R.drawable.background_light_top

    private var backgroundBottom: Int = R.drawable.background_light_bottom

    private var backgroundNormal: Int = R.drawable.background_light_normal

   // private lateinit  var view: View

    override fun getItemCount(): Int {
      return list.size //To change body of created functions use File | Settings | File Templates.
    }

    constructor(listMenu: List<Select>, asset: AssetManager, mContext: Context, isSingleSelection:Boolean,darkMode:Boolean) : this() {

        this.list = listMenu

        this.asset = asset

        this.mContext = mContext

        this.isSingleSelection = isSingleSelection

        if(darkMode){

            this.backgroundBottom = R.drawable.background_dark_bottom

            this.backgroundNormal = R.drawable.background_dark_normal

            this.backgroundTop = R.drawable.background_dark_top

            this.backgroundRounded = R.drawable.background_dark_rounded

        }

    }

    fun getListReady(): List<Select>{
        return  list;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_select, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val generalList = list[position]

        val check: Boolean = generalList.check

        val icon: Int = generalList.setImage.customIconResId

        val layoutParams = holder.cardView.layoutParams as ViewGroup.MarginLayoutParams

        holder.title.text = generalList.text

        holder.contentImg.setImageDrawable(null)
        holder.contentImg.setImageResource(0)

        holder.icon.layoutParams.height = generalList.setImage.size.iconHeight;

        holder.icon.layoutParams.width = generalList.setImage.size.iconWidth;

        holder.title.setTextColor(ContextCompat.getColor(mContext,generalList.color))

        if(check)
            holder.contentImg.setBackgroundResource(generalList.setImage.selectedIconResId)
        else
            holder.contentImg.setBackgroundResource(generalList.setImage.didSelectedIconResId)

        if(icon > 0)
            holder.icon.setBackgroundResource(icon)
        else
            holder.icon.visibility = View.GONE

        if(list.size - 1 > 0){

            if(position == 0){

                holder.cardView.background = ContextCompat.getDrawable(mContext,this.backgroundTop)

                layoutParams.setMargins(holder.cardView.marginLeft,25, holder.cardView.marginRight, holder.cardView.marginBottom)

            }else if(position == list.size - 1){

                holder.cardView.background = ContextCompat.getDrawable(mContext,this.backgroundBottom)

                layoutParams.setMargins(holder.cardView.marginLeft,holder.cardView.marginTop, holder.cardView.marginRight, 50)

            }else{

                holder.cardView.background = ContextCompat.getDrawable(mContext,this.backgroundNormal)

                layoutParams.setMargins(holder.cardView.marginLeft,holder.cardView.marginTop, holder.cardView.marginRight, holder.cardView.marginBottom)

            }

        }else{

            holder.cardView.background = ContextCompat.getDrawable(mContext,this.backgroundRounded)

            layoutParams.setMargins(holder.cardView.marginLeft,holder.cardView.marginTop, holder.cardView.marginRight, holder.cardView.marginBottom)

        }

    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener, EventListDynamic {

        var title: TextView
        var UnvContent: LinearLayout
        var contentImg: ImageView
        var icon: ImageView
        var cardView: CardView
        var mainContent: ConstraintLayout

        init {

            title = view.findViewById(R.id.tv_title)
            UnvContent = view.findViewById(R.id.lny_content)
            contentImg = view.findViewById(R.id.img_check)
            icon = view.findViewById(R.id.icon)
            cardView = view.findViewById(R.id.card_selected)
            mainContent = view.findViewById(R.id.main_content_select)

            UnvContent.setOnClickListener(this)
            UnvContent.eventImageCheckBoxSelect(this,contentImg)

        }

        override fun onClick(v: View) {

        }


        override fun eventEdtiText(str: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun eventChecked(isSelected: Boolean): Int {

            val position: Int = bindingAdapterPosition
            var imageSelected: Int = 0
            val modelList = list[position]

            list[position].check = isSelected

            imageSelected = if(isSelected)
                modelList.setImage.selectedIconResId
            else
                modelList.setImage.didSelectedIconResId

            imageCheck = imageSelected

            if(isSingleSelection && mContext is EventList){

                val event: EventList = mContext as EventList

                list.forEach { it.check = false }

                list[position].check = isSelected

                event.eventSetList(list)
            }

            return imageSelected

        }

        override fun getSelected(): Boolean {

            val position: Int = bindingAdapterPosition

            return if(position >= 0)
                list[position].check
            else
                false

        }
    }

}
