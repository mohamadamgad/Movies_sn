class CreateComments < ActiveRecord::Migration
  def up
    create_table :comments do |t|

    	t.integer "post_id"
    	t.text "comment"

      t.timestamps null: false
    end
  end

def down 
	drop_table :posts
end
end
