class CreateMovies < ActiveRecord::Migration
  def up
    create_table :movies do |t|

    	t.string "name"
    	t.string "year"
    	t.string "genre"
    	t.string "mood"
    	t.text "description"
 	    t.column :data, :binary, :limit => 10.megabyte
       t.timestamps null: false
    end
  end

def down 
	drop_table :movies
 
  end
end
